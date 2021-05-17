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
 * A request to convey information; e.g. the CDS system proposes that an
 * alert be sent to a responsible provider, the CDS system proposes that
 * the public health agency be notified about a reportable condition.
 */
public class CommunicationRequest extends FhirResource {
    public static final String RESOURCE_TYPE = "CommunicationRequest";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public CommunicationRequest(final JsonObject data) {
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
     * Business identifiers assigned to this communication request by the
     * performer or other systems which remain constant as the resource is
     * updated and propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * A plan or proposal that is fulfilled in whole or in part by this
     * request.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * Completed or terminated request(s) whose function is taken by this new
     * request.
     */
    public java.util.List<Reference> replaces() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REPLACES);
    }

    /**
     * A shared identifier common to all requests that were authorized more
     * or less simultaneously by a single author, representing the identifier
     * of the requisition, prescription or similar form.
     */
    public Identifier groupIdentifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_GROUP_IDENTIFIER);
    }

    /**
     * The status of the proposal or order.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Captures the reason for the current state of the CommunicationRequest.
     */
    public CodeableConcept statusReason() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_STATUS_REASON);
    }

    /**
     * The type of message to be sent such as alert, notification, reminder,
     * instruction, etc.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Characterizes how quickly the proposed act must be initiated. Includes
     * concepts such as stat, urgent, routine.
     */
    public String priority() {
        return getString(FhirPropertyNames.PROPERTY_PRIORITY);
    }

    /**
     * If true indicates that the CommunicationRequest is asking for the
     * specified action to *not* occur.
     */
    public Boolean doNotPerform() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM);
    }

    /**
     * A channel that was used for this communication (e.g. email, fax).
     */
    public java.util.List<CodeableConcept> medium() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_MEDIUM);
    }

    /**
     * The patient or group that is the focus of this communication request.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * Other resources that pertain to this communication request and to
     * which this communication request should be associated.
     */
    public java.util.List<Reference> about() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ABOUT);
    }

    /**
     * The Encounter during which this CommunicationRequest was created or to
     * which the creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * Text, attachment(s), or resource(s) to be communicated to the
     * recipient.
     */
    public java.util.List<CommunicationRequestPayload> payload() {
        return getList(CommunicationRequestPayload.class, FhirPropertyNames.PROPERTY_PAYLOAD);
    }

    /**
     * The time when this communication is to occur.
     */
    public String occurrenceDateTime() {
        return getString(FhirPropertyNames.PROPERTY_OCCURRENCE_DATE_TIME);
    }

    /**
     * The time when this communication is to occur.
     */
    public Period occurrencePeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_OCCURRENCE_PERIOD);
    }

    /**
     * For draft requests, indicates the date of initial creation.  For
     * requests with other statuses, indicates the date of activation.
     */
    public java.time.Instant authoredOn() {
        return getInstant(FhirPropertyNames.PROPERTY_AUTHORED_ON);
    }

    /**
     * The device, individual, or organization who initiated the request and
     * has responsibility for its activation.
     */
    public Reference requester() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUESTER);
    }

    /**
     * The entity (e.g. person, organization, clinical information system,
     * device, group, or care team) which is the intended target of the
     * communication.
     */
    public java.util.List<Reference> recipient() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_RECIPIENT);
    }

    /**
     * The entity (e.g. person, organization, clinical information system, or
     * device) which is to be the source of the communication.
     */
    public Reference sender() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SENDER);
    }

    /**
     * Describes why the request is being made in coded or textual form.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
    }

    /**
     * Indicates another resource whose existence justifies this request.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
    }

    /**
     * Comments made about the request by the requester, sender, recipient,
     * subject or other participants.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
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

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(FhirPropertyNames.PROPERTY_BASED_ON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder replaces(final java.util.List<Reference> replaces) {
            b.add(FhirPropertyNames.PROPERTY_REPLACES, FhirObject.toArray(replaces));
            return this;
        }

        public Builder groupIdentifier(final Identifier groupIdentifier) {
            b.add(FhirPropertyNames.PROPERTY_GROUP_IDENTIFIER, groupIdentifier);
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder statusReason(final CodeableConcept statusReason) {
            b.add(FhirPropertyNames.PROPERTY_STATUS_REASON, statusReason);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder priority(final String priority) {
            b.add(FhirPropertyNames.PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder doNotPerform(final Boolean doNotPerform) {
            b.add(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM, doNotPerform);
            return this;
        }

        public Builder medium(final java.util.List<CodeableConcept> medium) {
            b.add(FhirPropertyNames.PROPERTY_MEDIUM, FhirObject.toArray(medium));
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder about(final java.util.List<Reference> about) {
            b.add(FhirPropertyNames.PROPERTY_ABOUT, FhirObject.toArray(about));
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(FhirPropertyNames.PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder payload(final java.util.List<CommunicationRequestPayload> payload) {
            b.add(FhirPropertyNames.PROPERTY_PAYLOAD, FhirObject.toArray(payload));
            return this;
        }

        public Builder occurrenceDateTime(final String occurrenceDateTime) {
            b.add(FhirPropertyNames.PROPERTY_OCCURRENCE_DATE_TIME, occurrenceDateTime);
            return this;
        }

        public Builder occurrencePeriod(final Period occurrencePeriod) {
            b.add(FhirPropertyNames.PROPERTY_OCCURRENCE_PERIOD, occurrencePeriod);
            return this;
        }

        public Builder authoredOn(final java.time.Instant authoredOn) {
            b.add(FhirPropertyNames.PROPERTY_AUTHORED_ON, authoredOn.toString());
            return this;
        }

        public Builder requester(final Reference requester) {
            b.add(FhirPropertyNames.PROPERTY_REQUESTER, requester);
            return this;
        }

        public Builder recipient(final java.util.List<Reference> recipient) {
            b.add(FhirPropertyNames.PROPERTY_RECIPIENT, FhirObject.toArray(recipient));
            return this;
        }

        public Builder sender(final Reference sender) {
            b.add(FhirPropertyNames.PROPERTY_SENDER, sender);
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

        public CommunicationRequest build() {
            return new CommunicationRequest(b.build());
        }
    }

    /**
     * A request to convey information; e.g. the CDS system proposes that an
     * alert be sent to a responsible provider, the CDS system proposes that
     * the public health agency be notified about a reportable condition.
     */
    public static class CommunicationRequestPayload extends FhirObject {
        public static final String RESOURCE_TYPE = "CommunicationRequestPayload";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CommunicationRequestPayload(final JsonObject data) {
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
         * The communicated content (or for multi-part communications, one
         * portion of the communication).
         */
        public String contentString() {
            return getString(FhirPropertyNames.PROPERTY_CONTENT_STRING);
        }

        /**
         * The communicated content (or for multi-part communications, one
         * portion of the communication).
         */
        public Attachment contentAttachment() {
            return getObject(Attachment.class, FhirPropertyNames.PROPERTY_CONTENT_ATTACHMENT);
        }

        /**
         * The communicated content (or for multi-part communications, one
         * portion of the communication).
         */
        public Reference contentReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_CONTENT_REFERENCE);
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

            public Builder contentString(final String contentString) {
                b.add(FhirPropertyNames.PROPERTY_CONTENT_STRING, contentString);
                return this;
            }

            public Builder contentAttachment(final Attachment contentAttachment) {
                b.add(FhirPropertyNames.PROPERTY_CONTENT_ATTACHMENT, contentAttachment);
                return this;
            }

            public Builder contentReference(final Reference contentReference) {
                b.add(FhirPropertyNames.PROPERTY_CONTENT_REFERENCE, contentReference);
                return this;
            }

            public CommunicationRequestPayload build() {
                return new CommunicationRequestPayload(b.build());
            }
        }
    }
}
