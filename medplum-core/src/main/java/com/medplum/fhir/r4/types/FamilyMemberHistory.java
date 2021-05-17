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
 * Significant health conditions for a person related to the patient
 * relevant in the context of care for the patient.
 */
public class FamilyMemberHistory extends FhirResource {
    public static final String RESOURCE_TYPE = "FamilyMemberHistory";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public FamilyMemberHistory(final JsonObject data) {
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
     * Business identifiers assigned to this family member history by the
     * performer or other systems which remain constant as the resource is
     * updated and propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, orderset or
     * other definition that is adhered to in whole or in part by this
     * FamilyMemberHistory.
     */
    public java.util.List<String> instantiatesCanonical() {
        return getList(String.class, FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL);
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline,
     * orderset or other definition that is adhered to in whole or in part by
     * this FamilyMemberHistory.
     */
    public java.util.List<java.net.URI> instantiatesUri() {
        return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_INSTANTIATES_URI);
    }

    /**
     * A code specifying the status of the record of the family history of a
     * specific family member.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Describes why the family member's history is not available.
     */
    public CodeableConcept dataAbsentReason() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_DATA_ABSENT_REASON);
    }

    /**
     * The person who this history concerns.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * The date (and possibly time) when the family member history was
     * recorded or last updated.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * This will either be a name or a description; e.g. &quot;Aunt Susan&quot;, &quot;my
     * cousin with the red hair&quot;.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * The type of relationship this person has to the patient (father,
     * mother, brother etc.).
     */
    public CodeableConcept relationship() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_RELATIONSHIP);
    }

    /**
     * The birth sex of the family member.
     */
    public CodeableConcept sex() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SEX);
    }

    /**
     * The actual or approximate date of birth of the relative.
     */
    public Period bornPeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_BORN_PERIOD);
    }

    /**
     * The actual or approximate date of birth of the relative.
     */
    public String bornDate() {
        return getString(FhirPropertyNames.PROPERTY_BORN_DATE);
    }

    /**
     * The actual or approximate date of birth of the relative.
     */
    public String bornString() {
        return getString(FhirPropertyNames.PROPERTY_BORN_STRING);
    }

    /**
     * The age of the relative at the time the family member history is
     * recorded.
     */
    public Age ageAge() {
        return getObject(Age.class, FhirPropertyNames.PROPERTY_AGE_AGE);
    }

    /**
     * The age of the relative at the time the family member history is
     * recorded.
     */
    public Range ageRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_AGE_RANGE);
    }

    /**
     * The age of the relative at the time the family member history is
     * recorded.
     */
    public String ageString() {
        return getString(FhirPropertyNames.PROPERTY_AGE_STRING);
    }

    /**
     * If true, indicates that the age value specified is an estimated value.
     */
    public Boolean estimatedAge() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ESTIMATED_AGE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public Boolean deceasedBoolean() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_DECEASED_BOOLEAN);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public Age deceasedAge() {
        return getObject(Age.class, FhirPropertyNames.PROPERTY_DECEASED_AGE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public Range deceasedRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_DECEASED_RANGE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public String deceasedDate() {
        return getString(FhirPropertyNames.PROPERTY_DECEASED_DATE);
    }

    /**
     * Deceased flag or the actual or approximate age of the relative at the
     * time of death for the family member history record.
     */
    public String deceasedString() {
        return getString(FhirPropertyNames.PROPERTY_DECEASED_STRING);
    }

    /**
     * Describes why the family member history occurred in coded or textual
     * form.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
    }

    /**
     * Indicates a Condition, Observation, AllergyIntolerance, or
     * QuestionnaireResponse that justifies this family member history event.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
    }

    /**
     * This property allows a non condition-specific note to the made about
     * the related person. Ideally, the note would be in the condition
     * property, but this is not always possible.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * The significant Conditions (or condition) that the family member had.
     * This is a repeating section to allow a system to represent more than
     * one condition per resource, though there is nothing stopping multiple
     * resources - one per condition.
     */
    public java.util.List<FamilyMemberHistoryCondition> condition() {
        return getList(FamilyMemberHistoryCondition.class, FhirPropertyNames.PROPERTY_CONDITION);
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

        public Builder instantiatesCanonical(final java.util.List<String> instantiatesCanonical) {
            b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL, FhirObject.toStringArray(instantiatesCanonical));
            return this;
        }

        public Builder instantiatesUri(final java.util.List<java.net.URI> instantiatesUri) {
            b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_URI, FhirObject.toUriArray(instantiatesUri));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder dataAbsentReason(final CodeableConcept dataAbsentReason) {
            b.add(FhirPropertyNames.PROPERTY_DATA_ABSENT_REASON, dataAbsentReason);
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

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder relationship(final CodeableConcept relationship) {
            b.add(FhirPropertyNames.PROPERTY_RELATIONSHIP, relationship);
            return this;
        }

        public Builder sex(final CodeableConcept sex) {
            b.add(FhirPropertyNames.PROPERTY_SEX, sex);
            return this;
        }

        public Builder bornPeriod(final Period bornPeriod) {
            b.add(FhirPropertyNames.PROPERTY_BORN_PERIOD, bornPeriod);
            return this;
        }

        public Builder bornDate(final String bornDate) {
            b.add(FhirPropertyNames.PROPERTY_BORN_DATE, bornDate);
            return this;
        }

        public Builder bornString(final String bornString) {
            b.add(FhirPropertyNames.PROPERTY_BORN_STRING, bornString);
            return this;
        }

        public Builder ageAge(final Age ageAge) {
            b.add(FhirPropertyNames.PROPERTY_AGE_AGE, ageAge);
            return this;
        }

        public Builder ageRange(final Range ageRange) {
            b.add(FhirPropertyNames.PROPERTY_AGE_RANGE, ageRange);
            return this;
        }

        public Builder ageString(final String ageString) {
            b.add(FhirPropertyNames.PROPERTY_AGE_STRING, ageString);
            return this;
        }

        public Builder estimatedAge(final Boolean estimatedAge) {
            b.add(FhirPropertyNames.PROPERTY_ESTIMATED_AGE, estimatedAge);
            return this;
        }

        public Builder deceasedBoolean(final Boolean deceasedBoolean) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_BOOLEAN, deceasedBoolean);
            return this;
        }

        public Builder deceasedAge(final Age deceasedAge) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_AGE, deceasedAge);
            return this;
        }

        public Builder deceasedRange(final Range deceasedRange) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_RANGE, deceasedRange);
            return this;
        }

        public Builder deceasedDate(final String deceasedDate) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_DATE, deceasedDate);
            return this;
        }

        public Builder deceasedString(final String deceasedString) {
            b.add(FhirPropertyNames.PROPERTY_DECEASED_STRING, deceasedString);
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(FhirPropertyNames.PROPERTY_REASON_CODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(FhirPropertyNames.PROPERTY_REASON_REFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder condition(final java.util.List<FamilyMemberHistoryCondition> condition) {
            b.add(FhirPropertyNames.PROPERTY_CONDITION, FhirObject.toArray(condition));
            return this;
        }

        public FamilyMemberHistory build() {
            return new FamilyMemberHistory(b.build());
        }
    }

    /**
     * Significant health conditions for a person related to the patient
     * relevant in the context of care for the patient.
     */
    public static class FamilyMemberHistoryCondition extends FhirObject {
        public static final String RESOURCE_TYPE = "FamilyMemberHistoryCondition";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public FamilyMemberHistoryCondition(final JsonObject data) {
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
         * The actual condition specified. Could be a coded condition (like MI or
         * Diabetes) or a less specific string like 'cancer' depending on how
         * much is known about the condition and the capabilities of the creating
         * system.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Indicates what happened following the condition.  If the condition
         * resulted in death, deceased date is captured on the relation.
         */
        public CodeableConcept outcome() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_OUTCOME);
        }

        /**
         * This condition contributed to the cause of death of the related
         * person. If contributedToDeath is not populated, then it is unknown.
         */
        public Boolean contributedToDeath() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_CONTRIBUTED_TO_DEATH);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public Age onsetAge() {
            return getObject(Age.class, FhirPropertyNames.PROPERTY_ONSET_AGE);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public Range onsetRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_ONSET_RANGE);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public Period onsetPeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_ONSET_PERIOD);
        }

        /**
         * Either the age of onset, range of approximate age or descriptive
         * string can be recorded.  For conditions with multiple occurrences,
         * this describes the first known occurrence.
         */
        public String onsetString() {
            return getString(FhirPropertyNames.PROPERTY_ONSET_STRING);
        }

        /**
         * An area where general notes can be placed about this specific
         * condition.
         */
        public java.util.List<Annotation> note() {
            return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
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

            public Builder outcome(final CodeableConcept outcome) {
                b.add(FhirPropertyNames.PROPERTY_OUTCOME, outcome);
                return this;
            }

            public Builder contributedToDeath(final Boolean contributedToDeath) {
                b.add(FhirPropertyNames.PROPERTY_CONTRIBUTED_TO_DEATH, contributedToDeath);
                return this;
            }

            public Builder onsetAge(final Age onsetAge) {
                b.add(FhirPropertyNames.PROPERTY_ONSET_AGE, onsetAge);
                return this;
            }

            public Builder onsetRange(final Range onsetRange) {
                b.add(FhirPropertyNames.PROPERTY_ONSET_RANGE, onsetRange);
                return this;
            }

            public Builder onsetPeriod(final Period onsetPeriod) {
                b.add(FhirPropertyNames.PROPERTY_ONSET_PERIOD, onsetPeriod);
                return this;
            }

            public Builder onsetString(final String onsetString) {
                b.add(FhirPropertyNames.PROPERTY_ONSET_STRING, onsetString);
                return this;
            }

            public Builder note(final java.util.List<Annotation> note) {
                b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
                return this;
            }

            public FamilyMemberHistoryCondition build() {
                return new FamilyMemberHistoryCondition(b.build());
            }
        }
    }
}
