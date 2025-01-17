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
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;
import rediscache.models.ErrorResponseException;
import rediscache.models.PrivateEndpointConnection;
import rediscache.models.PrivateEndpointConnectionListResult;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointConnections.
 */
public final class PrivateEndpointConnections {
    /**
     * The proxy service used to perform REST calls.
     */
    private final PrivateEndpointConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private final RedisCacheClient client;

    /**
     * Initializes an instance of PrivateEndpointConnections.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    PrivateEndpointConnections(RedisCacheClient client) {
        this.service = RestProxy.create(PrivateEndpointConnectionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RedisCacheClientPrivateEndpointConnections to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RedisCacheClientPriv")
    public interface PrivateEndpointConnectionsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/privateEndpointConnections")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<PrivateEndpointConnectionListResult>> list(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<PrivateEndpointConnection>> get(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<PrivateEndpointConnection>> put(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @BodyParam("application/json") PrivateEndpointConnection properties, @HeaderParam("Accept") String accept,
            Context context);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Cache/redis/{cacheName}/privateEndpointConnections/{privateEndpointConnectionName}")
        @ExpectedResponses({ 200, 204 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("cacheName") String cacheName,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("privateEndpointConnectionName") String privateEndpointConnectionName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List all the private endpoint connections associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateEndpointConnection>> listSinglePageAsync(String resourceGroupName,
        String cacheName) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getHost(), resourceGroupName, cacheName,
                this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context))
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), null, null));
    }

    /**
     * List all the private endpoint connections associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateEndpointConnection>> listSinglePageAsync(String resourceGroupName,
        String cacheName, Context context) {
        final String accept = "application/json";
        return service
            .list(this.client.getHost(), resourceGroupName, cacheName, this.client.getApiVersion(),
                this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().getValue(), null, null));
    }

    /**
     * List all the private endpoint connections associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     * with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateEndpointConnection> listAsync(String resourceGroupName, String cacheName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, cacheName));
    }

    /**
     * List all the private endpoint connections associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     * with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateEndpointConnection> listAsync(String resourceGroupName, String cacheName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, cacheName, context));
    }

    /**
     * Gets the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the redis cache along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateEndpointConnection>> getWithResponseAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName) {
        return FluxUtil.withContext(
            context -> getWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName, context));
    }

    /**
     * Gets the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the redis cache along with {@link Response} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateEndpointConnection>> getWithResponseAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), resourceGroupName, cacheName, privateEndpointConnectionName,
            this.client.getApiVersion(), this.client.getSubscriptionId(), accept, context);
    }

    /**
     * Gets the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the redis cache on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnection> getAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName) {
        return getWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the redis cache on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnection> getAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the state of specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateEndpointConnection>> putWithResponseAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, PrivateEndpointConnection properties) {
        return FluxUtil.withContext(context -> putWithResponseAsync(resourceGroupName, cacheName,
            privateEndpointConnectionName, properties, context));
    }

    /**
     * Update the state of specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateEndpointConnection>> putWithResponseAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, PrivateEndpointConnection properties, Context context) {
        final String accept = "application/json";
        return service.put(this.client.getHost(), resourceGroupName, cacheName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), privateEndpointConnectionName, properties, accept, context);
    }

    /**
     * Update the state of specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnection> putAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, PrivateEndpointConnection properties) {
        return putWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName, properties)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Update the state of specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateEndpointConnection> putAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, PrivateEndpointConnection properties, Context context) {
        return putWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName, properties, context)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Deletes the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName) {
        return FluxUtil.withContext(
            context -> deleteWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName, context));
    }

    /**
     * Deletes the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String cacheName,
        String privateEndpointConnectionName, Context context) {
        final String accept = "application/json";
        return service.delete(this.client.getHost(), resourceGroupName, cacheName, this.client.getApiVersion(),
            this.client.getSubscriptionId(), privateEndpointConnectionName, accept, context);
    }

    /**
     * Deletes the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String cacheName, String privateEndpointConnectionName) {
        return deleteWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes the specified private endpoint connection associated with the redis cache.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param cacheName The name of the Redis cache.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     * resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String cacheName, String privateEndpointConnectionName,
        Context context) {
        return deleteWithResponseAsync(resourceGroupName, cacheName, privateEndpointConnectionName, context)
            .flatMap(ignored -> Mono.empty());
    }
}
