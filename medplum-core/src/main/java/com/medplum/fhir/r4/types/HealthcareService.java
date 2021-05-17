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
 * The details of a healthcare service available at a location.
 */
public class HealthcareService extends FhirResource {
    public static final String RESOURCE_TYPE = "HealthcareService";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public HealthcareService(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public java.net.URI implicitRules() {
        return getUri(FhirPropertyNames.PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(FhirPropertyNames.PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, FhirPropertyNames.PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, FhirPropertyNames.PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * External identifiers for this item.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * This flag is used to mark the record to not be used. This is not used
     * when a center is closed for maintenance, or for holidays, the
     * notAvailable period is to be used for this.
     */
    public Boolean active() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ACTIVE);
    }

    /**
     * The organization that provides this healthcare service.
     */
    public Reference providedBy() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PROVIDED_BY);
    }

    /**
     * Identifies the broad category of service being performed or delivered.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * The specific type of service that may be delivered or performed.
     */
    public java.util.List<CodeableConcept> type() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * Collection of specialties handled by the service site. This is more of
     * a medical term.
     */
    public java.util.List<CodeableConcept> specialty() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SPECIALTY);
    }

    /**
     * The location(s) where this healthcare service may be provided.
     */
    public java.util.List<Reference> location() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
    }

    /**
     * Further description of the service as it would be presented to a
     * consumer while searching.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * Any additional description of the service and/or any specific issues
     * not covered by the other attributes, which can be displayed as further
     * detail under the serviceName.
     */
    public String comment() {
        return getString(FhirPropertyNames.PROPERTY_COMMENT);
    }

    /**
     * Extra details about the service that can't be placed in the other
     * fields.
     */
    public String extraDetails() {
        return getString(FhirPropertyNames.PROPERTY_EXTRA_DETAILS);
    }

    /**
     * If there is a photo/symbol associated with this HealthcareService, it
     * may be included here to facilitate quick identification of the service
     * in a list.
     */
    public Attachment photo() {
        return getObject(Attachment.class, FhirPropertyNames.PROPERTY_PHOTO);
    }

    /**
     * List of contacts related to this specific healthcare service.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, FhirPropertyNames.PROPERTY_TELECOM);
    }

    /**
     * The location(s) that this service is available to (not where the
     * service is provided).
     */
    public java.util.List<Reference> coverageArea() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_COVERAGE_AREA);
    }

    /**
     * The code(s) that detail the conditions under which the healthcare
     * service is available/offered.
     */
    public java.util.List<CodeableConcept> serviceProvisionCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SERVICE_PROVISION_CODE);
    }

    /**
     * Does this service have specific eligibility requirements that need to
     * be met in order to use the service?
     */
    public java.util.List<HealthcareServiceEligibility> eligibility() {
        return getList(HealthcareServiceEligibility.class, FhirPropertyNames.PROPERTY_ELIGIBILITY);
    }

    /**
     * Programs that this service is applicable to.
     */
    public java.util.List<CodeableConcept> program() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_PROGRAM);
    }

    /**
     * Collection of characteristics (attributes).
     */
    public java.util.List<CodeableConcept> characteristic() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CHARACTERISTIC);
    }

    /**
     * Some services are specifically made available in multiple languages,
     * this property permits a directory to declare the languages this is
     * offered in. Typically this is only provided where a service operates
     * in communities with mixed languages used.
     */
    public java.util.List<CodeableConcept> communication() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_COMMUNICATION);
    }

    /**
     * Ways that the service accepts referrals, if this is not provided then
     * it is implied that no referral is required.
     */
    public java.util.List<CodeableConcept> referralMethod() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REFERRAL_METHOD);
    }

    /**
     * Indicates whether or not a prospective consumer will require an
     * appointment for a particular service at a site to be provided by the
     * Organization. Indicates if an appointment is required for access to
     * this service.
     */
    public Boolean appointmentRequired() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_APPOINTMENT_REQUIRED);
    }

    /**
     * A collection of times that the Service Site is available.
     */
    public java.util.List<HealthcareServiceAvailableTime> availableTime() {
        return getList(HealthcareServiceAvailableTime.class, FhirPropertyNames.PROPERTY_AVAILABLE_TIME);
    }

    /**
     * The HealthcareService is not available during this period of time due
     * to the provided reason.
     */
    public java.util.List<HealthcareServiceNotAvailable> notAvailable() {
        return getList(HealthcareServiceNotAvailable.class, FhirPropertyNames.PROPERTY_NOT_AVAILABLE);
    }

    /**
     * A description of site availability exceptions, e.g. public holiday
     * availability. Succinctly describing all possible exceptions to normal
     * site availability as details in the available Times and not available
     * Times.
     */
    public String availabilityExceptions() {
        return getString(FhirPropertyNames.PROPERTY_AVAILABILITY_EXCEPTIONS);
    }

    /**
     * Technical endpoints providing access to services operated for the
     * specific healthcare services defined at this resource.
     */
    public java.util.List<Reference> endpoint() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ENDPOINT);
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

        public Builder meta(final Meta meta) {
            b.add(FhirPropertyNames.PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final java.net.URI implicitRules) {
            b.add(FhirPropertyNames.PROPERTY_IMPLICIT_RULES, implicitRules.toString());
            return this;
        }

        public Builder language(final String language) {
            b.add(FhirPropertyNames.PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(FhirPropertyNames.PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(FhirPropertyNames.PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder active(final Boolean active) {
            b.add(FhirPropertyNames.PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder providedBy(final Reference providedBy) {
            b.add(FhirPropertyNames.PROPERTY_PROVIDED_BY, providedBy);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder type(final java.util.List<CodeableConcept> type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, FhirObject.toArray(type));
            return this;
        }

        public Builder specialty(final java.util.List<CodeableConcept> specialty) {
            b.add(FhirPropertyNames.PROPERTY_SPECIALTY, FhirObject.toArray(specialty));
            return this;
        }

        public Builder location(final java.util.List<Reference> location) {
            b.add(FhirPropertyNames.PROPERTY_LOCATION, FhirObject.toArray(location));
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder comment(final String comment) {
            b.add(FhirPropertyNames.PROPERTY_COMMENT, comment);
            return this;
        }

        public Builder extraDetails(final String extraDetails) {
            b.add(FhirPropertyNames.PROPERTY_EXTRA_DETAILS, extraDetails);
            return this;
        }

        public Builder photo(final Attachment photo) {
            b.add(FhirPropertyNames.PROPERTY_PHOTO, photo);
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(FhirPropertyNames.PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder coverageArea(final java.util.List<Reference> coverageArea) {
            b.add(FhirPropertyNames.PROPERTY_COVERAGE_AREA, FhirObject.toArray(coverageArea));
            return this;
        }

        public Builder serviceProvisionCode(final java.util.List<CodeableConcept> serviceProvisionCode) {
            b.add(FhirPropertyNames.PROPERTY_SERVICE_PROVISION_CODE, FhirObject.toArray(serviceProvisionCode));
            return this;
        }

        public Builder eligibility(final java.util.List<HealthcareServiceEligibility> eligibility) {
            b.add(FhirPropertyNames.PROPERTY_ELIGIBILITY, FhirObject.toArray(eligibility));
            return this;
        }

        public Builder program(final java.util.List<CodeableConcept> program) {
            b.add(FhirPropertyNames.PROPERTY_PROGRAM, FhirObject.toArray(program));
            return this;
        }

        public Builder characteristic(final java.util.List<CodeableConcept> characteristic) {
            b.add(FhirPropertyNames.PROPERTY_CHARACTERISTIC, FhirObject.toArray(characteristic));
            return this;
        }

        public Builder communication(final java.util.List<CodeableConcept> communication) {
            b.add(FhirPropertyNames.PROPERTY_COMMUNICATION, FhirObject.toArray(communication));
            return this;
        }

        public Builder referralMethod(final java.util.List<CodeableConcept> referralMethod) {
            b.add(FhirPropertyNames.PROPERTY_REFERRAL_METHOD, FhirObject.toArray(referralMethod));
            return this;
        }

        public Builder appointmentRequired(final Boolean appointmentRequired) {
            b.add(FhirPropertyNames.PROPERTY_APPOINTMENT_REQUIRED, appointmentRequired);
            return this;
        }

        public Builder availableTime(final java.util.List<HealthcareServiceAvailableTime> availableTime) {
            b.add(FhirPropertyNames.PROPERTY_AVAILABLE_TIME, FhirObject.toArray(availableTime));
            return this;
        }

        public Builder notAvailable(final java.util.List<HealthcareServiceNotAvailable> notAvailable) {
            b.add(FhirPropertyNames.PROPERTY_NOT_AVAILABLE, FhirObject.toArray(notAvailable));
            return this;
        }

        public Builder availabilityExceptions(final String availabilityExceptions) {
            b.add(FhirPropertyNames.PROPERTY_AVAILABILITY_EXCEPTIONS, availabilityExceptions);
            return this;
        }

        public Builder endpoint(final java.util.List<Reference> endpoint) {
            b.add(FhirPropertyNames.PROPERTY_ENDPOINT, FhirObject.toArray(endpoint));
            return this;
        }

        public HealthcareService build() {
            return new HealthcareService(b.build());
        }
    }

    /**
     * The details of a healthcare service available at a location.
     */
    public static class HealthcareServiceAvailableTime extends FhirObject {
        public static final String RESOURCE_TYPE = "HealthcareServiceAvailableTime";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public HealthcareServiceAvailableTime(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Indicates which days of the week are available between the start and
         * end Times.
         */
        public java.util.List<String> daysOfWeek() {
            return getList(String.class, FhirPropertyNames.PROPERTY_DAYS_OF_WEEK);
        }

        /**
         * Is this always available? (hence times are irrelevant) e.g. 24 hour
         * service.
         */
        public Boolean allDay() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_ALL_DAY);
        }

        /**
         * The opening time of day. Note: If the AllDay flag is set, then this
         * time is ignored.
         */
        public java.time.Instant availableStartTime() {
            return getInstant(FhirPropertyNames.PROPERTY_AVAILABLE_START_TIME);
        }

        /**
         * The closing time of day. Note: If the AllDay flag is set, then this
         * time is ignored.
         */
        public java.time.Instant availableEndTime() {
            return getInstant(FhirPropertyNames.PROPERTY_AVAILABLE_END_TIME);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder daysOfWeek(final java.util.List<String> daysOfWeek) {
                b.add(FhirPropertyNames.PROPERTY_DAYS_OF_WEEK, FhirObject.toStringArray(daysOfWeek));
                return this;
            }

            public Builder allDay(final Boolean allDay) {
                b.add(FhirPropertyNames.PROPERTY_ALL_DAY, allDay);
                return this;
            }

            public Builder availableStartTime(final java.time.Instant availableStartTime) {
                b.add(FhirPropertyNames.PROPERTY_AVAILABLE_START_TIME, availableStartTime.toString());
                return this;
            }

            public Builder availableEndTime(final java.time.Instant availableEndTime) {
                b.add(FhirPropertyNames.PROPERTY_AVAILABLE_END_TIME, availableEndTime.toString());
                return this;
            }

            public HealthcareServiceAvailableTime build() {
                return new HealthcareServiceAvailableTime(b.build());
            }
        }
    }

    /**
     * The details of a healthcare service available at a location.
     */
    public static class HealthcareServiceEligibility extends FhirObject {
        public static final String RESOURCE_TYPE = "HealthcareServiceEligibility";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public HealthcareServiceEligibility(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Coded value for the eligibility.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Describes the eligibility conditions for the service.
         */
        public String comment() {
            return getString(FhirPropertyNames.PROPERTY_COMMENT);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder comment(final String comment) {
                b.add(FhirPropertyNames.PROPERTY_COMMENT, comment);
                return this;
            }

            public HealthcareServiceEligibility build() {
                return new HealthcareServiceEligibility(b.build());
            }
        }
    }

    /**
     * The details of a healthcare service available at a location.
     */
    public static class HealthcareServiceNotAvailable extends FhirObject {
        public static final String RESOURCE_TYPE = "HealthcareServiceNotAvailable";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public HealthcareServiceNotAvailable(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * The reason that can be presented to the user as to why this time is
         * not available.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * Service is not available (seasonally or for a public holiday) from
         * this date.
         */
        public Period during() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_DURING);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder during(final Period during) {
                b.add(FhirPropertyNames.PROPERTY_DURING, during);
                return this;
            }

            public HealthcareServiceNotAvailable build() {
                return new HealthcareServiceNotAvailable(b.build());
            }
        }
    }
}
