// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;
import rediscache.models.ErrorResponseException;
import rediscache.models.OperationStatus;

/**
 * An instance of this class provides access to all the operations defined in AsyncOperationStatus.
 */
public final class AsyncOperationStatus {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AsyncOperationStatusService service;

    /**
     * The service client containing this operation class.
     */
    private final RedisCacheClient client;

    /**
     * Initializes an instance of AsyncOperationStatus.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AsyncOperationStatus(RedisCacheClient client) {
        this.service = RestProxy.create(AsyncOperationStatusService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RedisCacheClientAsyncOperationStatus to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RedisCacheClientAsyn")
    public interface AsyncOperationStatusService {
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Cache/locations/{location}/asyncOperations/{operationId}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<OperationStatus>> get(@HostParam("$host") String host, @PathParam("location") String location,
            @PathParam("operationId") String operationId, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId, @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * For checking the ongoing status of an operation.
     * 
     * @param location The location at which operation was triggered.
     * @param operationId The ID of asynchronous operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asynchronous operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OperationStatus>> getWithResponseAsync(String location, String operationId) {
        return FluxUtil.withContext(context -> getWithResponseAsync(location, operationId, context));
    }

    /**
     * For checking the ongoing status of an operation.
     * 
     * @param location The location at which operation was triggered.
     * @param operationId The ID of asynchronous operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asynchronous operation status along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OperationStatus>> getWithResponseAsync(String location, String operationId, Context context) {
        final String accept = "application/json";
        return service.get(this.client.getHost(), location, operationId, this.client.getApiVersion(),
            this.client.getSubscriptionId(), accept, context);
    }

    /**
     * For checking the ongoing status of an operation.
     * 
     * @param location The location at which operation was triggered.
     * @param operationId The ID of asynchronous operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asynchronous operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OperationStatus> getAsync(String location, String operationId) {
        return getWithResponseAsync(location, operationId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * For checking the ongoing status of an operation.
     * 
     * @param location The location at which operation was triggered.
     * @param operationId The ID of asynchronous operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return asynchronous operation status on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OperationStatus> getAsync(String location, String operationId, Context context) {
        return getWithResponseAsync(location, operationId, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }
}