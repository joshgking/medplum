/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * The EventDefinition resource provides a reusable description of when a
 * particular event can occur.
 */
public class EventDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "EventDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public EventDefinition(final JsonObject data) {
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
     * An absolute URI that is used to identify this event definition when it
     * is referenced in a specification, model, design or an instance; also
     * called its canonical identifier. This SHOULD be globally unique and
     * SHOULD be a literal address at which at which an authoritative
     * instance of this event definition is (or will be) published. This URL
     * can be the target of a canonical reference. It SHALL remain the same
     * when the event definition is stored on different servers.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * A formal identifier that is used to identify this event definition
     * when it is represented in other formats, or referenced in a
     * specification, model, design or an instance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier that is used to identify this version of the event
     * definition when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the event definition
     * author and is not expected to be globally unique. For example, it
     * might be a timestamp (e.g. yyyymmdd) if a managed version is not
     * available. There is also no expectation that versions can be placed in
     * a lexicographical sequence.
     */
    public String version() {
        return getString(FhirPropertyNames.PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the event definition. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * A short, descriptive, user-friendly title for the event definition.
     */
    public String title() {
        return getString(FhirPropertyNames.PROPERTY_TITLE);
    }

    /**
     * An explanatory or alternate title for the event definition giving
     * additional information about its content.
     */
    public String subtitle() {
        return getString(FhirPropertyNames.PROPERTY_SUBTITLE);
    }

    /**
     * The status of this event definition. Enables tracking the life-cycle
     * of the content.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this event definition is authored for
     * testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_EXPERIMENTAL);
    }

    /**
     * A code or group definition that describes the intended subject of the
     * event definition.
     */
    public CodeableConcept subjectCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SUBJECT_CODEABLE_CONCEPT);
    }

    /**
     * A code or group definition that describes the intended subject of the
     * event definition.
     */
    public Reference subjectReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT_REFERENCE);
    }

    /**
     * The date  (and optionally time) when the event definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the event definition changes.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the event
     * definition.
     */
    public String publisher() {
        return getString(FhirPropertyNames.PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    /**
     * A free text natural language description of the event definition from
     * a consumer's perspective.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate event definition instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, FhirPropertyNames.PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the event definition is intended
     * to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this event definition is needed and why it has been
     * designed as it has.
     */
    public String purpose() {
        return getString(FhirPropertyNames.PROPERTY_PURPOSE);
    }

    /**
     * A detailed description of how the event definition is used from a
     * clinical perspective.
     */
    public String usage() {
        return getString(FhirPropertyNames.PROPERTY_USAGE);
    }

    /**
     * A copyright statement relating to the event definition and/or its
     * contents. Copyright statements are generally legal restrictions on the
     * use and publishing of the event definition.
     */
    public String copyright() {
        return getString(FhirPropertyNames.PROPERTY_COPYRIGHT);
    }

    /**
     * The date on which the resource content was approved by the publisher.
     * Approval happens once when the content is officially approved for
     * usage.
     */
    public java.time.LocalDate approvalDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_APPROVAL_DATE);
    }

    /**
     * The date on which the resource content was last reviewed. Review
     * happens periodically after approval but does not change the original
     * approval date.
     */
    public java.time.LocalDate lastReviewDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_LAST_REVIEW_DATE);
    }

    /**
     * The period during which the event definition content was or is planned
     * to be in active use.
     */
    public Period effectivePeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_EFFECTIVE_PERIOD);
    }

    /**
     * Descriptive topics related to the module. Topics provide a high-level
     * categorization of the module that can be useful for filtering and
     * searching.
     */
    public java.util.List<CodeableConcept> topic() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_TOPIC);
    }

    /**
     * An individiual or organization primarily involved in the creation and
     * maintenance of the content.
     */
    public java.util.List<ContactDetail> author() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_AUTHOR);
    }

    /**
     * An individual or organization primarily responsible for internal
     * coherence of the content.
     */
    public java.util.List<ContactDetail> editor() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_EDITOR);
    }

    /**
     * An individual or organization primarily responsible for review of some
     * aspect of the content.
     */
    public java.util.List<ContactDetail> reviewer() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_REVIEWER);
    }

    /**
     * An individual or organization responsible for officially endorsing the
     * content for use in some setting.
     */
    public java.util.List<ContactDetail> endorser() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_ENDORSER);
    }

    /**
     * Related resources such as additional documentation, justification, or
     * bibliographic references.
     */
    public java.util.List<RelatedArtifact> relatedArtifact() {
        return getList(RelatedArtifact.class, FhirPropertyNames.PROPERTY_RELATED_ARTIFACT);
    }

    /**
     * The trigger element defines when the event occurs. If more than one
     * trigger condition is specified, the event fires whenever any one of
     * the trigger conditions is met.
     */
    public java.util.List<TriggerDefinition> trigger() {
        return getList(TriggerDefinition.class, FhirPropertyNames.PROPERTY_TRIGGER);
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

        public Builder url(final java.net.URI url) {
            b.add(FhirPropertyNames.PROPERTY_URL, url.toString());
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder version(final String version) {
            b.add(FhirPropertyNames.PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder title(final String title) {
            b.add(FhirPropertyNames.PROPERTY_TITLE, title);
            return this;
        }

        public Builder subtitle(final String subtitle) {
            b.add(FhirPropertyNames.PROPERTY_SUBTITLE, subtitle);
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(FhirPropertyNames.PROPERTY_EXPERIMENTAL, experimental);
            return this;
        }

        public Builder subjectCodeableConcept(final CodeableConcept subjectCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT_CODEABLE_CONCEPT, subjectCodeableConcept);
            return this;
        }

        public Builder subjectReference(final Reference subjectReference) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT_REFERENCE, subjectReference);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(FhirPropertyNames.PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(FhirPropertyNames.PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(FhirPropertyNames.PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(FhirPropertyNames.PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder usage(final String usage) {
            b.add(FhirPropertyNames.PROPERTY_USAGE, usage);
            return this;
        }

        public Builder copyright(final String copyright) {
            b.add(FhirPropertyNames.PROPERTY_COPYRIGHT, copyright);
            return this;
        }

        public Builder approvalDate(final java.time.LocalDate approvalDate) {
            b.add(FhirPropertyNames.PROPERTY_APPROVAL_DATE, approvalDate.toString());
            return this;
        }

        public Builder lastReviewDate(final java.time.LocalDate lastReviewDate) {
            b.add(FhirPropertyNames.PROPERTY_LAST_REVIEW_DATE, lastReviewDate.toString());
            return this;
        }

        public Builder effectivePeriod(final Period effectivePeriod) {
            b.add(FhirPropertyNames.PROPERTY_EFFECTIVE_PERIOD, effectivePeriod);
            return this;
        }

        public Builder topic(final java.util.List<CodeableConcept> topic) {
            b.add(FhirPropertyNames.PROPERTY_TOPIC, FhirObject.toArray(topic));
            return this;
        }

        public Builder author(final java.util.List<ContactDetail> author) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder editor(final java.util.List<ContactDetail> editor) {
            b.add(FhirPropertyNames.PROPERTY_EDITOR, FhirObject.toArray(editor));
            return this;
        }

        public Builder reviewer(final java.util.List<ContactDetail> reviewer) {
            b.add(FhirPropertyNames.PROPERTY_REVIEWER, FhirObject.toArray(reviewer));
            return this;
        }

        public Builder endorser(final java.util.List<ContactDetail> endorser) {
            b.add(FhirPropertyNames.PROPERTY_ENDORSER, FhirObject.toArray(endorser));
            return this;
        }

        public Builder relatedArtifact(final java.util.List<RelatedArtifact> relatedArtifact) {
            b.add(FhirPropertyNames.PROPERTY_RELATED_ARTIFACT, FhirObject.toArray(relatedArtifact));
            return this;
        }

        public Builder trigger(final java.util.List<TriggerDefinition> trigger) {
            b.add(FhirPropertyNames.PROPERTY_TRIGGER, FhirObject.toArray(trigger));
            return this;
        }

        public EventDefinition build() {
            return new EventDefinition(b.build());
        }
    }
}
