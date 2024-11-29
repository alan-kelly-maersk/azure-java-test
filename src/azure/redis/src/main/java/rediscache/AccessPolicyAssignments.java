// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;
import rediscache.models.AccessPolicyAssignmentsDeleteHeaders;
import rediscache.models.ErrorResponseException;
import rediscache.models.RedisCacheAccessPolicyAssignment;
import rediscache.models.RedisCacheAccessPolicyAssignmentList;

/**
 * An instance of this class provides access to all the operations defined in AccessPolicyAssignments.
 */
public final class AccessPolicyAssignments {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AccessPolicyAssignmentsService service;

    /**
     * The service client containing this operation class.
     */
    private final RedisCacheClient client;

    /**
     * Initializes an instance of AccessPolicyAssignments.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AccessPolicyAssignments(RedisCacheClient client) {
        this.service = RestProxy.create(AccessPolicyAssignmentsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RedisCacheClientAccessPolicyAssignments to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RedisCacheClientAcce")
    public interface AccessPolicyAssignmentsService {
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/accessPolicyAssignments/{accessPolicyAssignmentName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<RedisCacheAccessPolicyAssignment>> createUpdate(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @PathParam("accessPolicyAssignmentName") String accessPolicyAssignmentName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") RedisCacheAccessPolicyAssignment parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/accessPolicyAssignments/{accessPolicyAssignmentName}")
        @ExpectedResponses({ 200, 202, 204 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<ResponseBase<AccessPolicyAssignmentsDeleteHeaders, Void>> delete(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @PathParam("accessPolicyAssignmentName") String accessPolicyAssignmentName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/accessPolicyAssignments/{accessPolicyAssignmentName}")
        @ExpectedResponses({ 200, 202, 204 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> deleteNoCustomHeaders(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @PathParam("accessPolicyAssignmentName") String accessPolicyAssignmentName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/accessPolicyAssignments/{accessPolicyAssignmentName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<RedisCacheAccessPolicyAssignment>> get(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @PathParam("accessPolicyAssignmentName") String accessPolicyAssignmentName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/accessPolicyAssignments")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<RedisCacheAccessPolicyAssignmentList>> list(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<RedisCacheAccessPolicyAssignmentList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String host,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Adds the access policy assignment to the specified users.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param parameters Parameters supplied to the Create Update Access Policy Assignment operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to an operation on access policy assignment along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RedisCacheAccessPolicyAssignment>> createUpdateWithResponseAsync(String resourceGroupName,
        String cacheName, String accessPolicyAssignmentName, RedisCacheAccessPolicyAssignment parameters) {
        return FluxUtil.withContext(context -> createUpdateWithResponseAsync(resourceGroupName, cacheName,
            accessPolicyAssignmentName, parameters, context));
    }

    /**
     * Adds the access policy assignment to the specified users.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param parameters Parameters supplied to the Create Update Access Policy Assignment operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to an operation on access policy assignment along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RedisCacheAccessPolicyAssignment>> createUpdateWithResponseAsync(String resourceGroupName,
        String cacheName, String accessPolicyAssignmentName, RedisCacheAccessPolicyAssignment parameters,
        Context context) {
        final String accept = "application/json";
        return service.createUpdate(this.client.getHost(), resourceGroupName, cacheName, accessPolicyAssignmentName,
            this.client.getApiVersion(), this.client.getSubscriptionId(), parameters, accept, context);
    }

    /**
     * Adds the access policy assignment to the specified users.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param parameters Parameters supplied to the Create Update Access Policy Assignment operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to an operation on access policy assignment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RedisCacheAccessPolicyAssignment> createUpdateAsync(String resourceGroupName, String cacheName,
        String accessPolicyAssignmentName, RedisCacheAccessPolicyAssignment parameters) {
        return createUpdateWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Adds the access policy assignment to the specified users.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param parameters Parameters supplied to the Create Update Access Policy Assignment operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response to an operation on access policy assignment on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RedisCacheAccessPolicyAssignment> createUpdateAsync(String resourceGroupName, String cacheName,
        String accessPolicyAssignmentName, RedisCacheAccessPolicyAssignment parameters, Context context) {
        return createUpdateWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName, parameters,
            context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the access policy assignment from a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<AccessPolicyAssignmentsDeleteHeaders, Void>>
        deleteWithResponseAsync(String resourceGroupName, String cacheName, String accessPolicyAssignmentName) {
        return FluxUtil.withContext(
            context -> deleteWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName, context));
    }

    /**
     * Deletes the access policy assignment from a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResponseBase<AccessPolicyAssignmentsDeleteHeaders, Void>> deleteWithResponseAsync(
        String resourceGroupName, String cacheName, String accessPolicyAssignmentName, Context context) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), resourceGroupName, cacheName, accessPolicyAssignmentName,
            this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Deletes the access policy assignment from a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String cacheName, String accessPolicyAssignmentName) {
        return deleteWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes the access policy assignment from a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String cacheName, String accessPolicyAssignmentName,
        Context context) {
        return deleteWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName, context)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes the access policy assignment from a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteNoCustomHeadersWithResponseAsync(String resourceGroupName, String cacheName,
        String accessPolicyAssignmentName) {
        return FluxUtil.withContext(context -> deleteNoCustomHeadersWithResponseAsync(resourceGroupName, cacheName,
            accessPolicyAssignmentName, context));
    }

    /**
     * Deletes the access policy assignment from a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteNoCustomHeadersWithResponseAsync(String resourceGroupName, String cacheName,
        String accessPolicyAssignmentName, Context context) {
        final String accept = "application/json";
        return service.deleteNoCustomHeaders(this.client.getHost(), resourceGroupName, cacheName,
            accessPolicyAssignmentName, this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the list of assignments for an access policy of a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of assignments for an access policy of a redis cache along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RedisCacheAccessPolicyAssignment>> getWithResponseAsync(String resourceGroupName,
        String cacheName, String accessPolicyAssignmentName) {
        return FluxUtil.withContext(
            context -> getWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName, context));
    }

    /**
     * Gets the list of assignments for an access policy of a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of assignments for an access policy of a redis cache along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RedisCacheAccessPolicyAssignment>> getWithResponseAsync(String resourceGroupName,
        String cacheName, String accessPolicyAssignmentName, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), resourceGroupName, cacheName, accessPolicyAssignmentName,
            this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the list of assignments for an access policy of a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of assignments for an access policy of a redis cache on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RedisCacheAccessPolicyAssignment> getAsync(String resourceGroupName, String cacheName,
        String accessPolicyAssignmentName) {
        return getWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the list of assignments for an access policy of a redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param accessPolicyAssignmentName The name of the access policy assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of assignments for an access policy of a redis cache on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RedisCacheAccessPolicyAssignment> getAsync(String resourceGroupName, String cacheName,
        String accessPolicyAssignmentName, Context context) {
        return getWithResponseAsync(resourceGroupName, cacheName, accessPolicyAssignmentName, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the list of access policy assignments associated with this redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of access policy assignments associated with this redis cache along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RedisCacheAccessPolicyAssignment>> listSinglePageAsync(String resourceGroupName,
        String cacheName) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getHost(), resourceGroupName, cacheName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Gets the list of access policy assignments associated with this redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of access policy assignments associated with this redis cache along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RedisCacheAccessPolicyAssignment>> listSinglePageAsync(String resourceGroupName,
        String cacheName, Context context) {
        final String accept = "application/json";
        return service
            .list(this.client.getHost(), resourceGroupName, cacheName, this.client.getApiVersion(),
                this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Gets the list of access policy assignments associated with this redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of access policy assignments associated with this redis cache as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RedisCacheAccessPolicyAssignment> listAsync(String resourceGroupName, String cacheName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, cacheName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of access policy assignments associated with this redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of access policy assignments associated with this redis cache as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RedisCacheAccessPolicyAssignment> listAsync(String resourceGroupName, String cacheName,
        Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, cacheName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of access policies assignments (with properties) of a Redis cache along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RedisCacheAccessPolicyAssignment>> listNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getHost(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of access policies assignments (with properties) of a Redis cache along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RedisCacheAccessPolicyAssignment>> listNextSinglePageAsync(String nextLink,
        Context context) {
        final String accept = "application/json";
        return service.listNext(nextLink, this.client.getHost(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), res.getValue().getNextLink(), null));
    }
}
