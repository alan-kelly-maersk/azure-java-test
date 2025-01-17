// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameters required for creating a firewall rule on redis cache. (Note, you can just use the FirewallRule type
 * instead now.).
 */
@Fluent
public final class RedisFirewallRuleCreateParameters extends RedisFirewallRule {
    /*
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     */
    private String type;

    /*
     * The name of the resource
     */
    private String name;

    /*
     * Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{
     * resourceType}/{resourceName}
     */
    private String id;

    /**
     * Creates an instance of RedisFirewallRuleCreateParameters class.
     */
    public RedisFirewallRuleCreateParameters() {
    }

    /**
     * Get the type property: The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
     * "Microsoft.Storage/storageAccounts".
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     * 
     * @return the id value.
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisFirewallRuleCreateParameters setStartIP(String startIP) {
        super.setStartIP(startIP);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RedisFirewallRuleCreateParameters setEndIP(String endIP) {
        super.setEndIP(endIP);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getStartIP() != null || getEndIP() != null) {
            jsonWriter.writeStartObject("properties");
            jsonWriter.writeStringField("startIP", getStartIP());
            jsonWriter.writeStringField("endIP", getEndIP());
            jsonWriter.writeEndObject();
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisFirewallRuleCreateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisFirewallRuleCreateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RedisFirewallRuleCreateParameters.
     */
    public static RedisFirewallRuleCreateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisFirewallRuleCreateParameters deserializedRedisFirewallRuleCreateParameters
                = new RedisFirewallRuleCreateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRedisFirewallRuleCreateParameters.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRedisFirewallRuleCreateParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRedisFirewallRuleCreateParameters.type = reader.getString();
                } else if ("properties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("startIP".equals(fieldName)) {
                            deserializedRedisFirewallRuleCreateParameters.setStartIP(reader.getString());
                        } else if ("endIP".equals(fieldName)) {
                            deserializedRedisFirewallRuleCreateParameters.setEndIP(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRedisFirewallRuleCreateParameters;
        });
    }
}
