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
 * This resource provides the details including amount of a payment and
 * allocates the payment items being paid.
 */
public class PaymentReconciliation extends FhirResource {
    public static final String RESOURCE_TYPE = "PaymentReconciliation";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public PaymentReconciliation(final JsonObject data) {
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
     * A unique identifier assigned to this payment reconciliation.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The status of the resource instance.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * The period of time for which payments have been gathered into this
     * bulk payment for settlement.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    /**
     * The date when the resource was created.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * The party who generated the payment.
     */
    public Reference paymentIssuer() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PAYMENT_ISSUER);
    }

    /**
     * Original request resource reference.
     */
    public Reference request() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUEST);
    }

    /**
     * The practitioner who is responsible for the services rendered to the
     * patient.
     */
    public Reference requestor() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUESTOR);
    }

    /**
     * The outcome of a request for a reconciliation.
     */
    public String outcome() {
        return getString(FhirPropertyNames.PROPERTY_OUTCOME);
    }

    /**
     * A human readable description of the status of the request for the
     * reconciliation.
     */
    public String disposition() {
        return getString(FhirPropertyNames.PROPERTY_DISPOSITION);
    }

    /**
     * The date of payment as indicated on the financial instrument.
     */
    public java.time.LocalDate paymentDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_PAYMENT_DATE);
    }

    /**
     * Total payment amount as indicated on the financial instrument.
     */
    public Money paymentAmount() {
        return getObject(Money.class, FhirPropertyNames.PROPERTY_PAYMENT_AMOUNT);
    }

    /**
     * Issuer's unique identifier for the payment instrument.
     */
    public Identifier paymentIdentifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_PAYMENT_IDENTIFIER);
    }

    /**
     * Distribution of the payment amount for a previously acknowledged
     * payable.
     */
    public java.util.List<PaymentReconciliationDetail> detail() {
        return getList(PaymentReconciliationDetail.class, FhirPropertyNames.PROPERTY_DETAIL);
    }

    /**
     * A code for the form to be used for printing the content.
     */
    public CodeableConcept formCode() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FORM_CODE);
    }

    /**
     * A note that describes or explains the processing in a human readable
     * form.
     */
    public java.util.List<PaymentReconciliationProcessNote> processNote() {
        return getList(PaymentReconciliationProcessNote.class, FhirPropertyNames.PROPERTY_PROCESS_NOTE);
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

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder paymentIssuer(final Reference paymentIssuer) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT_ISSUER, paymentIssuer);
            return this;
        }

        public Builder request(final Reference request) {
            b.add(FhirPropertyNames.PROPERTY_REQUEST, request);
            return this;
        }

        public Builder requestor(final Reference requestor) {
            b.add(FhirPropertyNames.PROPERTY_REQUESTOR, requestor);
            return this;
        }

        public Builder outcome(final String outcome) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder disposition(final String disposition) {
            b.add(FhirPropertyNames.PROPERTY_DISPOSITION, disposition);
            return this;
        }

        public Builder paymentDate(final java.time.LocalDate paymentDate) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT_DATE, paymentDate.toString());
            return this;
        }

        public Builder paymentAmount(final Money paymentAmount) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT_AMOUNT, paymentAmount);
            return this;
        }

        public Builder paymentIdentifier(final Identifier paymentIdentifier) {
            b.add(FhirPropertyNames.PROPERTY_PAYMENT_IDENTIFIER, paymentIdentifier);
            return this;
        }

        public Builder detail(final java.util.List<PaymentReconciliationDetail> detail) {
            b.add(FhirPropertyNames.PROPERTY_DETAIL, FhirObject.toArray(detail));
            return this;
        }

        public Builder formCode(final CodeableConcept formCode) {
            b.add(FhirPropertyNames.PROPERTY_FORM_CODE, formCode);
            return this;
        }

        public Builder processNote(final java.util.List<PaymentReconciliationProcessNote> processNote) {
            b.add(FhirPropertyNames.PROPERTY_PROCESS_NOTE, FhirObject.toArray(processNote));
            return this;
        }

        public PaymentReconciliation build() {
            return new PaymentReconciliation(b.build());
        }
    }

    /**
     * This resource provides the details including amount of a payment and
     * allocates the payment items being paid.
     */
    public static class PaymentReconciliationDetail extends FhirObject {
        public static final String RESOURCE_TYPE = "PaymentReconciliationDetail";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PaymentReconciliationDetail(final JsonObject data) {
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
         * Unique identifier for the current payment item for the referenced
         * payable.
         */
        public Identifier identifier() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
        }

        /**
         * Unique identifier for the prior payment item for the referenced
         * payable.
         */
        public Identifier predecessor() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_PREDECESSOR);
        }

        /**
         * Code to indicate the nature of the payment.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * A resource, such as a Claim, the evaluation of which could lead to
         * payment.
         */
        public Reference request() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUEST);
        }

        /**
         * The party which submitted the claim or financial transaction.
         */
        public Reference submitter() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBMITTER);
        }

        /**
         * A resource, such as a ClaimResponse, which contains a commitment to
         * payment.
         */
        public Reference response() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_RESPONSE);
        }

        /**
         * The date from the response resource containing a commitment to pay.
         */
        public java.time.LocalDate date() {
            return getLocalDate(FhirPropertyNames.PROPERTY_DATE);
        }

        /**
         * A reference to the individual who is responsible for inquiries
         * regarding the response and its payment.
         */
        public Reference responsible() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_RESPONSIBLE);
        }

        /**
         * The party which is receiving the payment.
         */
        public Reference payee() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_PAYEE);
        }

        /**
         * The monetary amount allocated from the total payment to the payable.
         */
        public Money amount() {
            return getObject(Money.class, FhirPropertyNames.PROPERTY_AMOUNT);
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

            public Builder identifier(final Identifier identifier) {
                b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, identifier);
                return this;
            }

            public Builder predecessor(final Identifier predecessor) {
                b.add(FhirPropertyNames.PROPERTY_PREDECESSOR, predecessor);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder request(final Reference request) {
                b.add(FhirPropertyNames.PROPERTY_REQUEST, request);
                return this;
            }

            public Builder submitter(final Reference submitter) {
                b.add(FhirPropertyNames.PROPERTY_SUBMITTER, submitter);
                return this;
            }

            public Builder response(final Reference response) {
                b.add(FhirPropertyNames.PROPERTY_RESPONSE, response);
                return this;
            }

            public Builder date(final java.time.LocalDate date) {
                b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
                return this;
            }

            public Builder responsible(final Reference responsible) {
                b.add(FhirPropertyNames.PROPERTY_RESPONSIBLE, responsible);
                return this;
            }

            public Builder payee(final Reference payee) {
                b.add(FhirPropertyNames.PROPERTY_PAYEE, payee);
                return this;
            }

            public Builder amount(final Money amount) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT, amount);
                return this;
            }

            public PaymentReconciliationDetail build() {
                return new PaymentReconciliationDetail(b.build());
            }
        }
    }

    /**
     * This resource provides the details including amount of a payment and
     * allocates the payment items being paid.
     */
    public static class PaymentReconciliationProcessNote extends FhirObject {
        public static final String RESOURCE_TYPE = "PaymentReconciliationProcessNote";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PaymentReconciliationProcessNote(final JsonObject data) {
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
         * The business purpose of the note text.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The explanation or description associated with the processing.
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder text(final String text) {
                b.add(FhirPropertyNames.PROPERTY_TEXT, text);
                return this;
            }

            public PaymentReconciliationProcessNote build() {
                return new PaymentReconciliationProcessNote(b.build());
            }
        }
    }
}
