// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.SqlScriptsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.SqlScriptResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class SqlScriptAsyncClient {
    private final SqlScriptsImpl serviceClient;

    /**
     * Initializes an instance of SqlScripts client.
     *
     * @param serviceClient the service client implementation.
     */
    SqlScriptAsyncClient(SqlScriptsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists sql scripts.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SqlScriptResource>> getSqlScriptsByWorkspaceSinglePage() {
        return this.serviceClient.getSqlScriptsByWorkspaceSinglePageAsync();
    }

    /**
     * Lists sql scripts.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SqlScriptResource> getSqlScriptsByWorkspace() {
        return this.serviceClient.getSqlScriptsByWorkspaceAsync();
    }

    /**
     * Creates or updates a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource definition.
     * @param ifMatch ETag of the SQL script entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlScriptResource>> createOrUpdateSqlScriptWithResponse(
            String sqlScriptName, SqlScriptResource sqlScript, String ifMatch) {
        return this.serviceClient.createOrUpdateSqlScriptWithResponseAsync(sqlScriptName, sqlScript, ifMatch);
    }

    /**
     * Creates or updates a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource definition.
     * @param ifMatch ETag of the SQL script entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> createOrUpdateSqlScript(
            String sqlScriptName, SqlScriptResource sqlScript, String ifMatch) {
        return this.serviceClient.createOrUpdateSqlScriptAsync(sqlScriptName, sqlScript, ifMatch);
    }

    /**
     * Creates or updates a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @param sqlScript Sql Script resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sql Script resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> createOrUpdateSqlScript(String sqlScriptName, SqlScriptResource sqlScript) {
        return this.serviceClient.createOrUpdateSqlScriptAsync(sqlScriptName, sqlScript);
    }

    /**
     * Gets a sql script.
     *
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SqlScriptResource>> getSqlScriptWithResponse(String sqlScriptName, String ifNoneMatch) {
        return this.serviceClient.getSqlScriptWithResponseAsync(sqlScriptName, ifNoneMatch);
    }

    /**
     * Gets a sql script.
     *
     * @param sqlScriptName The sql script name.
     * @param ifNoneMatch ETag of the sql compute entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> getSqlScript(String sqlScriptName, String ifNoneMatch) {
        return this.serviceClient.getSqlScriptAsync(sqlScriptName, ifNoneMatch);
    }

    /**
     * Gets a sql script.
     *
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sql script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SqlScriptResource> getSqlScript(String sqlScriptName) {
        return this.serviceClient.getSqlScriptAsync(sqlScriptName);
    }

    /**
     * Deletes a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteSqlScriptWithResponse(String sqlScriptName) {
        return this.serviceClient.deleteSqlScriptWithResponseAsync(sqlScriptName);
    }

    /**
     * Deletes a Sql Script.
     *
     * @param sqlScriptName The sql script name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteSqlScript(String sqlScriptName) {
        return this.serviceClient.deleteSqlScriptAsync(sqlScriptName);
    }

    /**
     * Renames a sqlScript.
     *
     * @param sqlScriptName The sql script name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renameSqlScriptWithResponse(String sqlScriptName, ArtifactRenameRequest request) {
        return this.serviceClient.renameSqlScriptWithResponseAsync(sqlScriptName, request);
    }

    /**
     * Renames a sqlScript.
     *
     * @param sqlScriptName The sql script name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> renameSqlScript(String sqlScriptName, ArtifactRenameRequest request) {
        return this.serviceClient.renameSqlScriptAsync(sqlScriptName, request);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sql scripts resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<SqlScriptResource>> getSqlScriptsByWorkspaceNextSinglePage(String nextLink) {
        return this.serviceClient.getSqlScriptsByWorkspaceNextSinglePageAsync(nextLink);
    }
}