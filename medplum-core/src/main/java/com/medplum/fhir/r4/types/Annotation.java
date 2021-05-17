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
 * A  text note which also  contains information about who made the
 * statement and when.
 */
public class Annotation extends FhirResource {
    public static final String RESOURCE_TYPE = "Annotation";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Annotation(final JsonObject data) {
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
     * The individual responsible for making the annotation.
     */
    public Reference authorReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR_REFERENCE);
    }

    /**
     * The individual responsible for making the annotation.
     */
    public String authorString() {
        return getString(FhirPropertyNames.PROPERTY_AUTHOR_STRING);
    }

    /**
     * Indicates when this particular annotation was made.
     */
    public java.time.Instant time() {
        return getInstant(FhirPropertyNames.PROPERTY_TIME);
    }

    /**
     * The text of the annotation in markdown format.
     */
    public String text() {
        return getString(FhirPropertyNames.PROPERTY_TEXT);
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

        public Builder authorReference(final Reference authorReference) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR_REFERENCE, authorReference);
            return this;
        }

        public Builder authorString(final String authorString) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR_STRING, authorString);
            return this;
        }

        public Builder time(final java.time.Instant time) {
            b.add(FhirPropertyNames.PROPERTY_TIME, time.toString());
            return this;
        }

        public Builder text(final String text) {
            b.add(FhirPropertyNames.PROPERTY_TEXT, text);
            return this;
        }

        public Annotation build() {
            return new Annotation(b.build());
        }
    }
}
