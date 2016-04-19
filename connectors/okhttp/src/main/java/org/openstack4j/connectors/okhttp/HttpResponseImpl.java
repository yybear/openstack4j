package org.openstack4j.connectors.okhttp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import okhttp3.Headers;
import okhttp3.Response;
import org.openstack4j.api.exceptions.ClientResponseException;
import org.openstack4j.core.transport.*;
import org.openstack4j.openstack.logging.Logger;
import org.openstack4j.openstack.logging.LoggerFactory;
import org.openstack4j.openstack.magnum.domain.MagnumBayModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class HttpResponseImpl implements HttpResponse {

    private static final Logger LOG = LoggerFactory.getLogger(HttpResponseImpl.class);
    private final Response response;

    private HttpResponseImpl(Response response) {
        this.response = response;
    }

    /**
     * Wrap the given Response
     *
     * @param response the response
     * @return the HttpResponse
     */
    public static HttpResponseImpl wrap(Response response) {
        return new HttpResponseImpl(response);
    }

    /**
     * Unwrap and return the original Response
     *
     * @return the response
     */
    public Response unwrap() {
        return response;
    }

    /**
     * Gets the entity and Maps any errors which will result in a ResponseException
     *
     * @param <T> the generic type
     * @param returnType the return type
     * @return the entity
     */
    public <T> T getEntity(Class<T> returnType) {
        return getEntity(returnType, null);
    }

    /**
     * Gets the entity and Maps any errors which will result in a ResponseException
     *
     * @param <T> the generic type
     * @param returnType the return type
     * @param options the execution options
     * @return the entity
     */
    @Override
    public <T> T getEntity(Class<T> returnType, ExecutionOptions<T> options) {
        return HttpEntityHandler.handle(this, returnType, options, Boolean.TRUE);
    }

    /**
     * Gets the status from the previous Request
     *
     * @return the status code
     */
    public int getStatus() {
        return response.code();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStatusMessage() {
        return response.message();
    }

    /**
     * @return the input stream
     */
    public InputStream getInputStream() {
        return response.body().byteStream();
    }

    /**
     * Returns a Header value from the specified name key
     *
     * @param name the name of the header to query for
     * @return the header as a String or null if not found
     */
    public String header(String name) {
        return response.header(name);
    }

    /**
     * @return the a Map of Header Name to Header Value
     */
    public Map<String, String> headers() {
        Map<String, String> retHeaders = new HashMap<String, String>();
        Headers headers =  response.headers();

        for (String name : headers.names()) {
            retHeaders.put(name, headers.get(name));
        }
        return retHeaders;
    }

    @Override
    public <T> T readEntity(Class<T> typeToReadAs) {
        try {
            String res = response.body().string();
            return ObjectMapperSingleton.getContext(typeToReadAs).reader(typeToReadAs).readValue(res);
        } catch (Exception e) {
            LOG.error(e, e.getMessage());
            throw new ClientResponseException(e.getMessage(), 0, e);
        }
    }

    @Override
    public void close() throws IOException {
    }
    
    @Override
    public String getContentType() {
        return header(ClientConstants.HEADER_CONTENT_TYPE);
    }

    public static void main(String[] args) {
        String res = "{\n" +
                "    \"links\": [{\n" +
                "        \"href\": \"http://127.0.0.1:9511/v1/baymodels/2ec5ee98-62c4-4776-ae53-f052e38a382c\",\n" +
                "        \"rel\": \"self\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"href\": \"http://127.0.0.1:9511/baymodels/2ec5ee98-62c4-4776-ae53-f052e38a382c\",\n" +
                "        \"rel\": \"bookmark\"\n" +
                "    }],\n" +
                "    \"labels\": {},\n" +
                "    \"updated_at\": null,\n" +
                "    \"master_flavor_id\": null,\n" +
                "    \"uuid\": \"2ec5ee98-62c4-4776-ae53-f052e38a382c\",\n" +
                "    \"no_proxy\": null,\n" +
                "    \"https_proxy\": null,\n" +
                "    \"tls_disabled\": false,\n" +
                "    \"keypair_id\": \"testkey\",\n" +
                "    \"public\": false,\n" +
                "    \"http_proxy\": null,\n" +
                "    \"docker_volume_size\": 5,\n" +
                "    \"server_type\": \"vm\",\n" +
                "    \"external_network_id\": \"ext-network\",\n" +
                "    \"cluster_distro\": \"fedora-atomic\",\n" +
                "    \"image_id\": \"fedora-21-atomic-5\",\n" +
                "    \"volume_driver\": null,\n" +
                "    \"registry_enabled\": false,\n" +
                "    \"apiserver_port\": null,\n" +
                "    \"name\": \"k8sbaymodel\",\n" +
                "    \"created_at\": \"2016-04-13T03:22:48+00:00\",\n" +
                "    \"network_driver\": \"flannel\",\n" +
                "    \"fixed_network\": null,\n" +
                "    \"coe\": \"kubernetes\",\n" +
                "    \"flavor_id\": \"m1.small\",\n" +
                "    \"dns_nameserver\": \"8.8.8.8\"\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();

        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        MagnumBayModel m = null;
        try {
            m = mapper.reader(MagnumBayModel.class).readValue(res);
            System.out.println(m.getDnsNameserver());
            System.out.println(m.getCoe());

            //System.out.println(mapper.writeValueAsString(m));
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectMapper rootMapper = new ObjectMapper();
        rootMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        rootMapper.enable(SerializationFeature.INDENT_OUTPUT);
        rootMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        rootMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        rootMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        rootMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        try {


            String s = rootMapper.writeValueAsString(m);

            MagnumBayModel m2 = rootMapper.reader(MagnumBayModel.class).readValue(s);
            System.out.println(m2.getCoe());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
