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
 * A patient's point-in-time set of recommendations (i.e. forecasting)
 * according to a published schedule with optional supporting
 * justification.
 */
public class ImmunizationRecommendation extends FhirResource {
    public static final String RESOURCE_TYPE = "ImmunizationRecommendation";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ImmunizationRecommendation(final JsonObject data) {
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
     * A unique identifier assigned to this particular recommendation record.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The patient the recommendation(s) are for.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * The date the immunization recommendation(s) were created.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * Indicates the authority who published the protocol (e.g. ACIP).
     */
    public Reference authority() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHORITY);
    }

    /**
     * Vaccine administration recommendations.
     */
    public java.util.List<ImmunizationRecommendationRecommendation> recommendation() {
        return getList(ImmunizationRecommendationRecommendation.class, FhirPropertyNames.PROPERTY_RECOMMENDATION);
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

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder authority(final Reference authority) {
            b.add(FhirPropertyNames.PROPERTY_AUTHORITY, authority);
            return this;
        }

        public Builder recommendation(final java.util.List<ImmunizationRecommendationRecommendation> recommendation) {
            b.add(FhirPropertyNames.PROPERTY_RECOMMENDATION, FhirObject.toArray(recommendation));
            return this;
        }

        public ImmunizationRecommendation build() {
            return new ImmunizationRecommendation(b.build());
        }
    }

    /**
     * A patient's point-in-time set of recommendations (i.e. forecasting)
     * according to a published schedule with optional supporting
     * justification.
     */
    public static class ImmunizationRecommendationDateCriterion extends FhirObject {
        public static final String RESOURCE_TYPE = "ImmunizationRecommendationDateCriterion";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ImmunizationRecommendationDateCriterion(final JsonObject data) {
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
         * Date classification of recommendation.  For example, earliest date to
         * give, latest date to give, etc.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The date whose meaning is specified by dateCriterion.code.
         */
        public java.time.Instant value() {
            return getInstant(FhirPropertyNames.PROPERTY_VALUE);
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

            public Builder value(final java.time.Instant value) {
                b.add(FhirPropertyNames.PROPERTY_VALUE, value.toString());
                return this;
            }

            public ImmunizationRecommendationDateCriterion build() {
                return new ImmunizationRecommendationDateCriterion(b.build());
            }
        }
    }

    /**
     * A patient's point-in-time set of recommendations (i.e. forecasting)
     * according to a published schedule with optional supporting
     * justification.
     */
    public static class ImmunizationRecommendationRecommendation extends FhirObject {
        public static final String RESOURCE_TYPE = "ImmunizationRecommendationRecommendation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ImmunizationRecommendationRecommendation(final JsonObject data) {
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
         * Vaccine(s) or vaccine group that pertain to the recommendation.
         */
        public java.util.List<CodeableConcept> vaccineCode() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_VACCINE_CODE);
        }

        /**
         * The targeted disease for the recommendation.
         */
        public CodeableConcept targetDisease() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TARGET_DISEASE);
        }

        /**
         * Vaccine(s) which should not be used to fulfill the recommendation.
         */
        public java.util.List<CodeableConcept> contraindicatedVaccineCode() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CONTRAINDICATED_VACCINE_CODE);
        }

        /**
         * Indicates the patient status with respect to the path to immunity for
         * the target disease.
         */
        public CodeableConcept forecastStatus() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FORECAST_STATUS);
        }

        /**
         * The reason for the assigned forecast status.
         */
        public java.util.List<CodeableConcept> forecastReason() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_FORECAST_REASON);
        }

        /**
         * Vaccine date recommendations.  For example, earliest date to
         * administer, latest date to administer, etc.
         */
        public java.util.List<ImmunizationRecommendationDateCriterion> dateCriterion() {
            return getList(ImmunizationRecommendationDateCriterion.class, FhirPropertyNames.PROPERTY_DATE_CRITERION);
        }

        /**
         * Contains the description about the protocol under which the vaccine
         * was administered.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * One possible path to achieve presumed immunity against a disease -
         * within the context of an authority.
         */
        public String series() {
            return getString(FhirPropertyNames.PROPERTY_SERIES);
        }

        /**
         * Nominal position of the recommended dose in a series (e.g. dose 2 is
         * the next recommended dose).
         */
        public Integer doseNumberPositiveInt() {
            return data.getInt(FhirPropertyNames.PROPERTY_DOSE_NUMBER_POSITIVE_INT);
        }

        /**
         * Nominal position of the recommended dose in a series (e.g. dose 2 is
         * the next recommended dose).
         */
        public String doseNumberString() {
            return getString(FhirPropertyNames.PROPERTY_DOSE_NUMBER_STRING);
        }

        /**
         * The recommended number of doses to achieve immunity.
         */
        public Integer seriesDosesPositiveInt() {
            return data.getInt(FhirPropertyNames.PROPERTY_SERIES_DOSES_POSITIVE_INT);
        }

        /**
         * The recommended number of doses to achieve immunity.
         */
        public String seriesDosesString() {
            return getString(FhirPropertyNames.PROPERTY_SERIES_DOSES_STRING);
        }

        /**
         * Immunization event history and/or evaluation that supports the status
         * and recommendation.
         */
        public java.util.List<Reference> supportingImmunization() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SUPPORTING_IMMUNIZATION);
        }

        /**
         * Patient Information that supports the status and recommendation.  This
         * includes patient observations, adverse reactions and
         * allergy/intolerance information.
         */
        public java.util.List<Reference> supportingPatientInformation() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SUPPORTING_PATIENT_INFORMATION);
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

            public Builder vaccineCode(final java.util.List<CodeableConcept> vaccineCode) {
                b.add(FhirPropertyNames.PROPERTY_VACCINE_CODE, FhirObject.toArray(vaccineCode));
                return this;
            }

            public Builder targetDisease(final CodeableConcept targetDisease) {
                b.add(FhirPropertyNames.PROPERTY_TARGET_DISEASE, targetDisease);
                return this;
            }

            public Builder contraindicatedVaccineCode(final java.util.List<CodeableConcept> contraindicatedVaccineCode) {
                b.add(FhirPropertyNames.PROPERTY_CONTRAINDICATED_VACCINE_CODE, FhirObject.toArray(contraindicatedVaccineCode));
                return this;
            }

            public Builder forecastStatus(final CodeableConcept forecastStatus) {
                b.add(FhirPropertyNames.PROPERTY_FORECAST_STATUS, forecastStatus);
                return this;
            }

            public Builder forecastReason(final java.util.List<CodeableConcept> forecastReason) {
                b.add(FhirPropertyNames.PROPERTY_FORECAST_REASON, FhirObject.toArray(forecastReason));
                return this;
            }

            public Builder dateCriterion(final java.util.List<ImmunizationRecommendationDateCriterion> dateCriterion) {
                b.add(FhirPropertyNames.PROPERTY_DATE_CRITERION, FhirObject.toArray(dateCriterion));
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder series(final String series) {
                b.add(FhirPropertyNames.PROPERTY_SERIES, series);
                return this;
            }

            public Builder doseNumberPositiveInt(final Integer doseNumberPositiveInt) {
                b.add(FhirPropertyNames.PROPERTY_DOSE_NUMBER_POSITIVE_INT, doseNumberPositiveInt);
                return this;
            }

            public Builder doseNumberString(final String doseNumberString) {
                b.add(FhirPropertyNames.PROPERTY_DOSE_NUMBER_STRING, doseNumberString);
                return this;
            }

            public Builder seriesDosesPositiveInt(final Integer seriesDosesPositiveInt) {
                b.add(FhirPropertyNames.PROPERTY_SERIES_DOSES_POSITIVE_INT, seriesDosesPositiveInt);
                return this;
            }

            public Builder seriesDosesString(final String seriesDosesString) {
                b.add(FhirPropertyNames.PROPERTY_SERIES_DOSES_STRING, seriesDosesString);
                return this;
            }

            public Builder supportingImmunization(final java.util.List<Reference> supportingImmunization) {
                b.add(FhirPropertyNames.PROPERTY_SUPPORTING_IMMUNIZATION, FhirObject.toArray(supportingImmunization));
                return this;
            }

            public Builder supportingPatientInformation(final java.util.List<Reference> supportingPatientInformation) {
                b.add(FhirPropertyNames.PROPERTY_SUPPORTING_PATIENT_INFORMATION, FhirObject.toArray(supportingPatientInformation));
                return this;
            }

            public ImmunizationRecommendationRecommendation build() {
                return new ImmunizationRecommendationRecommendation(b.build());
            }
        }
    }
}
