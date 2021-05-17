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
 * Record of delivery of what is supplied.
 */
public class SupplyDelivery extends FhirResource {
    public static final String RESOURCE_TYPE = "SupplyDelivery";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SupplyDelivery(final JsonObject data) {
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
     * Identifier for the supply delivery event that is used to identify it
     * across multiple disparate systems.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * A plan, proposal or order that is fulfilled in whole or in part by
     * this event.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * A larger event of which this particular event is a component or step.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_PART_OF);
    }

    /**
     * A code specifying the state of the dispense event.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A link to a resource representing the person whom the delivered item
     * is for.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * Indicates the type of dispensing event that is performed. Examples
     * include: Trial Fill, Completion of Trial, Partial Fill, Emergency
     * Fill, Samples, etc.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * The item that is being delivered or has been supplied.
     */
    public SupplyDeliverySuppliedItem suppliedItem() {
        return getObject(SupplyDeliverySuppliedItem.class, FhirPropertyNames.PROPERTY_SUPPLIED_ITEM);
    }

    /**
     * The date or time(s) the activity occurred.
     */
    public String occurrenceDateTime() {
        return getString(FhirPropertyNames.PROPERTY_OCCURRENCE_DATE_TIME);
    }

    /**
     * The date or time(s) the activity occurred.
     */
    public Period occurrencePeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_OCCURRENCE_PERIOD);
    }

    /**
     * The date or time(s) the activity occurred.
     */
    public Timing occurrenceTiming() {
        return getObject(Timing.class, FhirPropertyNames.PROPERTY_OCCURRENCE_TIMING);
    }

    /**
     * The individual responsible for dispensing the medication, supplier or
     * device.
     */
    public Reference supplier() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUPPLIER);
    }

    /**
     * Identification of the facility/location where the Supply was shipped
     * to, as part of the dispense event.
     */
    public Reference destination() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_DESTINATION);
    }

    /**
     * Identifies the person who picked up the Supply.
     */
    public java.util.List<Reference> receiver() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_RECEIVER);
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

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(FhirPropertyNames.PROPERTY_PART_OF, FhirObject.toArray(partOf));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder suppliedItem(final SupplyDeliverySuppliedItem suppliedItem) {
            b.add(FhirPropertyNames.PROPERTY_SUPPLIED_ITEM, suppliedItem);
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

        public Builder occurrenceTiming(final Timing occurrenceTiming) {
            b.add(FhirPropertyNames.PROPERTY_OCCURRENCE_TIMING, occurrenceTiming);
            return this;
        }

        public Builder supplier(final Reference supplier) {
            b.add(FhirPropertyNames.PROPERTY_SUPPLIER, supplier);
            return this;
        }

        public Builder destination(final Reference destination) {
            b.add(FhirPropertyNames.PROPERTY_DESTINATION, destination);
            return this;
        }

        public Builder receiver(final java.util.List<Reference> receiver) {
            b.add(FhirPropertyNames.PROPERTY_RECEIVER, FhirObject.toArray(receiver));
            return this;
        }

        public SupplyDelivery build() {
            return new SupplyDelivery(b.build());
        }
    }

    /**
     * Record of delivery of what is supplied.
     */
    public static class SupplyDeliverySuppliedItem extends FhirObject {
        public static final String RESOURCE_TYPE = "SupplyDeliverySuppliedItem";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SupplyDeliverySuppliedItem(final JsonObject data) {
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
         * The amount of supply that has been dispensed. Includes unit of
         * measure.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
        }

        /**
         * Identifies the medication, substance or device being dispensed. This
         * is either a link to a resource representing the details of the item or
         * a code that identifies the item from a known list.
         */
        public CodeableConcept itemCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ITEM_CODEABLE_CONCEPT);
        }

        /**
         * Identifies the medication, substance or device being dispensed. This
         * is either a link to a resource representing the details of the item or
         * a code that identifies the item from a known list.
         */
        public Reference itemReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ITEM_REFERENCE);
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

            public Builder quantity(final Quantity quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder itemCodeableConcept(final CodeableConcept itemCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_ITEM_CODEABLE_CONCEPT, itemCodeableConcept);
                return this;
            }

            public Builder itemReference(final Reference itemReference) {
                b.add(FhirPropertyNames.PROPERTY_ITEM_REFERENCE, itemReference);
                return this;
            }

            public SupplyDeliverySuppliedItem build() {
                return new SupplyDeliverySuppliedItem(b.build());
            }
        }
    }
}
