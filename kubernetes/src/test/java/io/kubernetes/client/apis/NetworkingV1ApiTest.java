/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1NetworkPolicy;
import io.kubernetes.client.models.V1NetworkPolicyList;
import io.kubernetes.client.models.V1Status;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkingV1Api
 */
@Ignore
public class NetworkingV1ApiTest {

    private final NetworkingV1Api api = new NetworkingV1Api();

    
    /**
     * 
     *
     * create a NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedNetworkPolicyTest() throws ApiException {
        String namespace = null;
        V1NetworkPolicy body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1NetworkPolicy response = api.createNamespacedNetworkPolicy(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedNetworkPolicyTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedNetworkPolicy(namespace, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedNetworkPolicyTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1DeleteOptions body = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedNetworkPolicy(name, namespace, pretty, body, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedNetworkPolicyTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1NetworkPolicyList response = api.listNamespacedNetworkPolicy(namespace, pretty, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNetworkPolicyForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1NetworkPolicyList response = api.listNetworkPolicyForAllNamespaces(_continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedNetworkPolicyTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1NetworkPolicy response = api.patchNamespacedNetworkPolicy(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedNetworkPolicyTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1NetworkPolicy response = api.readNamespacedNetworkPolicy(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified NetworkPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedNetworkPolicyTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1NetworkPolicy body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1NetworkPolicy response = api.replaceNamespacedNetworkPolicy(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
