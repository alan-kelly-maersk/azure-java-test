// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameter required for creating a linked server to redis cache.
 */
@Fluent
public class RedisLinkedServerCreateParameters implements JsonSerializable<RedisLinkedServerCreateParameters> {
    /*
     * Fully qualified resourceId of the linked redis cache.
     */
    private String linkedRedisCacheId;

    /*
     * Location of the linked redis cache.
     */
    private String linkedRedisCacheLocation;

    /*
     * Role of the linked server.
     */
    private ReplicationRole serverRole;

    /*
     * The unchanging DNS name which will always point to current geo-primary cache among the linked redis caches for
     * seamless Geo Failover experience.
     */
    private String geoReplicatedPrimaryHostName;

    /*
     * The changing DNS name that resolves to the current geo-primary cache among the linked redis caches before or
     * after the Geo Failover.
     */
    private String primaryHostName;

    /**
     * Creates an instance of RedisLinkedServerCreateParameters class.
     */
    public RedisLinkedServerCreateParameters() {
    }

    /**
     * Get the linkedRedisCacheId property: Fully qualified resourceId of the linked redis cache.
     * 
     * @return the linkedRedisCacheId value.
     */
    public String getLinkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }

    /**
     * Set the linkedRedisCacheId property: Fully qualified resourceId of the linked redis cache.
     * 
     * @param linkedRedisCacheId the linkedRedisCacheId value to set.
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters setLinkedRedisCacheId(String linkedRedisCacheId) {
        this.linkedRedisCacheId = linkedRedisCacheId;
        return this;
    }

    /**
     * Get the linkedRedisCacheLocation property: Location of the linked redis cache.
     * 
     * @return the linkedRedisCacheLocation value.
     */
    public String getLinkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }

    /**
     * Set the linkedRedisCacheLocation property: Location of the linked redis cache.
     * 
     * @param linkedRedisCacheLocation the linkedRedisCacheLocation value to set.
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters setLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
        this.linkedRedisCacheLocation = linkedRedisCacheLocation;
        return this;
    }

    /**
     * Get the serverRole property: Role of the linked server.
     * 
     * @return the serverRole value.
     */
    public ReplicationRole getServerRole() {
        return this.serverRole;
    }

    /**
     * Set the serverRole property: Role of the linked server.
     * 
     * @param serverRole the serverRole value to set.
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters setServerRole(ReplicationRole serverRole) {
        this.serverRole = serverRole;
        return this;
    }

    /**
     * Get the geoReplicatedPrimaryHostName property: The unchanging DNS name which will always point to current
     * geo-primary cache among the linked redis caches for seamless Geo Failover experience.
     * 
     * @return the geoReplicatedPrimaryHostName value.
     */
    public String getGeoReplicatedPrimaryHostName() {
        return this.geoReplicatedPrimaryHostName;
    }

    /**
     * Get the primaryHostName property: The changing DNS name that resolves to the current geo-primary cache among the
     * linked redis caches before or after the Geo Failover.
     * 
     * @return the primaryHostName value.
     */
    public String getPrimaryHostName() {
        return this.primaryHostName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (linkedRedisCacheId != null
            || linkedRedisCacheLocation != null
            || serverRole != null
            || geoReplicatedPrimaryHostName != null
            || primaryHostName != null) {
            jsonWriter.writeStartObject("properties");
            jsonWriter.writeStringField("linkedRedisCacheId", this.linkedRedisCacheId);
            jsonWriter.writeStringField("linkedRedisCacheLocation", this.linkedRedisCacheLocation);
            jsonWriter.writeStringField("serverRole", this.serverRole == null ? null : this.serverRole.toString());
            jsonWriter.writeEndObject();
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RedisLinkedServerCreateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RedisLinkedServerCreateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RedisLinkedServerCreateParameters.
     */
    public static RedisLinkedServerCreateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RedisLinkedServerCreateParameters deserializedRedisLinkedServerCreateParameters
                = new RedisLinkedServerCreateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("linkedRedisCacheId".equals(fieldName)) {
                            deserializedRedisLinkedServerCreateParameters.linkedRedisCacheId = reader.getString();
                        } else if ("linkedRedisCacheLocation".equals(fieldName)) {
                            deserializedRedisLinkedServerCreateParameters.linkedRedisCacheLocation = reader.getString();
                        } else if ("serverRole".equals(fieldName)) {
                            deserializedRedisLinkedServerCreateParameters.serverRole
                                = ReplicationRole.fromString(reader.getString());
                        } else if ("geoReplicatedPrimaryHostName".equals(fieldName)) {
                            deserializedRedisLinkedServerCreateParameters.geoReplicatedPrimaryHostName
                                = reader.getString();
                        } else if ("primaryHostName".equals(fieldName)) {
                            deserializedRedisLinkedServerCreateParameters.primaryHostName = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }
                }
                reader.skipChildren();
            }

            return deserializedRedisLinkedServerCreateParameters;
        });
    }
}