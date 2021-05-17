/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Details for all kinds of technology mediated contact points for a
 * person or organization, including telephone, email, etc.
 */
public class ContactPoint extends FhirResource {
    public static final String RESOURCE_TYPE = "ContactPoint";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ContactPoint(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(FhirPropertyNames.PROPERTY_ID);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the element. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
    }

    /**
     * Telecommunications form for contact point - what communications system
     * is required to make use of the contact.
     */
    public String system() {
        return getString(FhirPropertyNames.PROPERTY_SYSTEM);
    }

    /**
     * The actual contact point details, in a form that is meaningful to the
     * designated communication system (i.e. phone number or email address).
     */
    public String value() {
        return getString(FhirPropertyNames.PROPERTY_VALUE);
    }

    /**
     * Identifies the purpose for the contact point.
     */
    public String use() {
        return getString(FhirPropertyNames.PROPERTY_USE);
    }

    /**
     * Specifies a preferred order in which to use a set of contacts.
     * ContactPoints with lower rank values are more preferred than those
     * with higher rank values.
     */
    public Integer rank() {
        return data.getInt(FhirPropertyNames.PROPERTY_RANK);
    }

    /**
     * Time period when the contact point was/is in use.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    public static class Builder {
        private final JsonObjectBuilder b;

        private Builder() {
            b = Json.createObjectBuilder();
        }

        private Builder(final JsonObject data) {
            b = Json.createObjectBuilder(data);
        }

        public Builder id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder system(final String system) {
            b.add(FhirPropertyNames.PROPERTY_SYSTEM, system);
            return this;
        }

        public Builder value(final String value) {
            b.add(FhirPropertyNames.PROPERTY_VALUE, value);
            return this;
        }

        public Builder use(final String use) {
            b.add(FhirPropertyNames.PROPERTY_USE, use);
            return this;
        }

        public Builder rank(final Integer rank) {
            b.add(FhirPropertyNames.PROPERTY_RANK, rank);
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public ContactPoint build() {
            return new ContactPoint(b.build());
        }
    }
}
