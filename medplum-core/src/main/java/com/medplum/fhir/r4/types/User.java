/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * OAuth user.
 */
public class User extends FhirResource {
    public static final String RESOURCE_TYPE = "User";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public User(final JsonObject data) {
        super(data);
    }

    /**
     * User email.
     */
    public String email() {
        return getString(FhirPropertyNames.PROPERTY_EMAIL);
    }

    /**
     * Encrypted hash of the user's password.
     */
    public String passwordHash() {
        return getString(FhirPropertyNames.PROPERTY_PASSWORD_HASH);
    }

    /**
     * Optional reference to the user's patient identity.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * Optional reference to the user's practitioner identity.
     */
    public Reference practitioner() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRACTITIONER);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(FhirPropertyNames.PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return this;
        }

        public Builder email(final String email) {
            b.add(FhirPropertyNames.PROPERTY_EMAIL, email);
            return this;
        }

        public Builder passwordHash(final String passwordHash) {
            b.add(FhirPropertyNames.PROPERTY_PASSWORD_HASH, passwordHash);
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder practitioner(final Reference practitioner) {
            b.add(FhirPropertyNames.PROPERTY_PRACTITIONER, practitioner);
            return this;
        }

        public User build() {
            return new User(b.build());
        }
    }
}
