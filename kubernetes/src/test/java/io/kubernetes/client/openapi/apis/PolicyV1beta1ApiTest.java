/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.PolicyV1beta1PodSecurityPolicy;
import io.kubernetes.client.openapi.models.PolicyV1beta1PodSecurityPolicyList;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudget;
import io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PolicyV1beta1Api
 */
@Ignore
public class PolicyV1beta1ApiTest {

    private final PolicyV1beta1Api api = new PolicyV1beta1Api();

    
    /**
     * 
     *
     * create a PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedPodDisruptionBudgetTest() throws ApiException {
        String namespace = null;
        V1beta1PodDisruptionBudget body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1PodDisruptionBudget response = api.createNamespacedPodDisruptionBudget(namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPodSecurityPolicyTest() throws ApiException {
        PolicyV1beta1PodSecurityPolicy body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        PolicyV1beta1PodSecurityPolicy response = api.createPodSecurityPolicy(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedPodDisruptionBudgetTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionNamespacedPodDisruptionBudget(namespace, pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionPodSecurityPolicyTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionPodSecurityPolicy(pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteNamespacedPodDisruptionBudget(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePodSecurityPolicyTest() throws ApiException {
        String name = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deletePodSecurityPolicy(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

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
     * list or watch objects of kind PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedPodDisruptionBudgetTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1PodDisruptionBudgetList response = api.listNamespacedPodDisruptionBudget(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPodDisruptionBudgetForAllNamespacesTest() throws ApiException {
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1PodDisruptionBudgetList response = api.listPodDisruptionBudgetForAllNamespaces(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPodSecurityPolicyTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        PolicyV1beta1PodSecurityPolicyList response = api.listPodSecurityPolicy(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1beta1PodDisruptionBudget response = api.patchNamespacedPodDisruptionBudget(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedPodDisruptionBudgetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1beta1PodDisruptionBudget response = api.patchNamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPodSecurityPolicyTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        PolicyV1beta1PodSecurityPolicy response = api.patchPodSecurityPolicy(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1PodDisruptionBudget response = api.readNamespacedPodDisruptionBudget(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedPodDisruptionBudgetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1PodDisruptionBudget response = api.readNamespacedPodDisruptionBudgetStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPodSecurityPolicyTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        PolicyV1beta1PodSecurityPolicy response = api.readPodSecurityPolicy(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedPodDisruptionBudgetTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1PodDisruptionBudget body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1PodDisruptionBudget response = api.replaceNamespacedPodDisruptionBudget(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified PodDisruptionBudget
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedPodDisruptionBudgetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1PodDisruptionBudget body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1beta1PodDisruptionBudget response = api.replaceNamespacedPodDisruptionBudgetStatus(name, namespace, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified PodSecurityPolicy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replacePodSecurityPolicyTest() throws ApiException {
        String name = null;
        PolicyV1beta1PodSecurityPolicy body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        PolicyV1beta1PodSecurityPolicy response = api.replacePodSecurityPolicy(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
