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
 * An authorization for the provision of glasses and/or contact lenses to
 * a patient.
 */
public class VisionPrescription extends FhirResource {
    public static final String RESOURCE_TYPE = "VisionPrescription";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public VisionPrescription(final JsonObject data) {
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
     * A unique identifier assigned to this vision prescription.
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
     * The date this resource was created.
     */
    public java.time.Instant created() {
        return getInstant(FhirPropertyNames.PROPERTY_CREATED);
    }

    /**
     * A resource reference to the person to whom the vision prescription
     * applies.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * A reference to a resource that identifies the particular occurrence of
     * contact between patient and health care provider during which the
     * prescription was issued.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * The date (and perhaps time) when the prescription was written.
     */
    public java.time.Instant dateWritten() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE_WRITTEN);
    }

    /**
     * The healthcare professional responsible for authorizing the
     * prescription.
     */
    public Reference prescriber() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRESCRIBER);
    }

    /**
     * Contain the details of  the individual lens specifications and serves
     * as the authorization for the fullfillment by certified professionals.
     */
    public java.util.List<VisionPrescriptionLensSpecification> lensSpecification() {
        return getList(VisionPrescriptionLensSpecification.class, FhirPropertyNames.PROPERTY_LENS_SPECIFICATION);
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

        public Builder created(final java.time.Instant created) {
            b.add(FhirPropertyNames.PROPERTY_CREATED, created.toString());
            return this;
        }

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(FhirPropertyNames.PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder dateWritten(final java.time.Instant dateWritten) {
            b.add(FhirPropertyNames.PROPERTY_DATE_WRITTEN, dateWritten.toString());
            return this;
        }

        public Builder prescriber(final Reference prescriber) {
            b.add(FhirPropertyNames.PROPERTY_PRESCRIBER, prescriber);
            return this;
        }

        public Builder lensSpecification(final java.util.List<VisionPrescriptionLensSpecification> lensSpecification) {
            b.add(FhirPropertyNames.PROPERTY_LENS_SPECIFICATION, FhirObject.toArray(lensSpecification));
            return this;
        }

        public VisionPrescription build() {
            return new VisionPrescription(b.build());
        }
    }

    /**
     * An authorization for the provision of glasses and/or contact lenses to
     * a patient.
     */
    public static class VisionPrescriptionLensSpecification extends FhirObject {
        public static final String RESOURCE_TYPE = "VisionPrescriptionLensSpecification";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public VisionPrescriptionLensSpecification(final JsonObject data) {
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
         * Identifies the type of vision correction product which is required for
         * the patient.
         */
        public CodeableConcept product() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRODUCT);
        }

        /**
         * The eye for which the lens specification applies.
         */
        public String eye() {
            return getString(FhirPropertyNames.PROPERTY_EYE);
        }

        /**
         * Lens power measured in dioptres (0.25 units).
         */
        public Double sphere() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_SPHERE).doubleValue();
        }

        /**
         * Power adjustment for astigmatism measured in dioptres (0.25 units).
         */
        public Double cylinder() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_CYLINDER).doubleValue();
        }

        /**
         * Adjustment for astigmatism measured in integer degrees.
         */
        public Integer axis() {
            return data.getInt(FhirPropertyNames.PROPERTY_AXIS);
        }

        /**
         * Allows for adjustment on two axis.
         */
        public java.util.List<VisionPrescriptionPrism> prism() {
            return getList(VisionPrescriptionPrism.class, FhirPropertyNames.PROPERTY_PRISM);
        }

        /**
         * Power adjustment for multifocal lenses measured in dioptres (0.25
         * units).
         */
        public Double add() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_ADD).doubleValue();
        }

        /**
         * Contact lens power measured in dioptres (0.25 units).
         */
        public Double power() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_POWER).doubleValue();
        }

        /**
         * Back curvature measured in millimetres.
         */
        public Double backCurve() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_BACK_CURVE).doubleValue();
        }

        /**
         * Contact lens diameter measured in millimetres.
         */
        public Double diameter() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_DIAMETER).doubleValue();
        }

        /**
         * The recommended maximum wear period for the lens.
         */
        public Quantity duration() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_DURATION);
        }

        /**
         * Special color or pattern.
         */
        public String color() {
            return getString(FhirPropertyNames.PROPERTY_COLOR);
        }

        /**
         * Brand recommendations or restrictions.
         */
        public String brand() {
            return getString(FhirPropertyNames.PROPERTY_BRAND);
        }

        /**
         * Notes for special requirements such as coatings and lens materials.
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

            public Builder product(final CodeableConcept product) {
                b.add(FhirPropertyNames.PROPERTY_PRODUCT, product);
                return this;
            }

            public Builder eye(final String eye) {
                b.add(FhirPropertyNames.PROPERTY_EYE, eye);
                return this;
            }

            public Builder sphere(final Double sphere) {
                b.add(FhirPropertyNames.PROPERTY_SPHERE, sphere);
                return this;
            }

            public Builder cylinder(final Double cylinder) {
                b.add(FhirPropertyNames.PROPERTY_CYLINDER, cylinder);
                return this;
            }

            public Builder axis(final Integer axis) {
                b.add(FhirPropertyNames.PROPERTY_AXIS, axis);
                return this;
            }

            public Builder prism(final java.util.List<VisionPrescriptionPrism> prism) {
                b.add(FhirPropertyNames.PROPERTY_PRISM, FhirObject.toArray(prism));
                return this;
            }

            public Builder add(final Double add) {
                b.add(FhirPropertyNames.PROPERTY_ADD, add);
                return this;
            }

            public Builder power(final Double power) {
                b.add(FhirPropertyNames.PROPERTY_POWER, power);
                return this;
            }

            public Builder backCurve(final Double backCurve) {
                b.add(FhirPropertyNames.PROPERTY_BACK_CURVE, backCurve);
                return this;
            }

            public Builder diameter(final Double diameter) {
                b.add(FhirPropertyNames.PROPERTY_DIAMETER, diameter);
                return this;
            }

            public Builder duration(final Quantity duration) {
                b.add(FhirPropertyNames.PROPERTY_DURATION, duration);
                return this;
            }

            public Builder color(final String color) {
                b.add(FhirPropertyNames.PROPERTY_COLOR, color);
                return this;
            }

            public Builder brand(final String brand) {
                b.add(FhirPropertyNames.PROPERTY_BRAND, brand);
                return this;
            }

            public Builder note(final java.util.List<Annotation> note) {
                b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
                return this;
            }

            public VisionPrescriptionLensSpecification build() {
                return new VisionPrescriptionLensSpecification(b.build());
            }
        }
    }

    /**
     * An authorization for the provision of glasses and/or contact lenses to
     * a patient.
     */
    public static class VisionPrescriptionPrism extends FhirObject {
        public static final String RESOURCE_TYPE = "VisionPrescriptionPrism";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public VisionPrescriptionPrism(final JsonObject data) {
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
         * Amount of prism to compensate for eye alignment in fractional units.
         */
        public Double amount() {
            return data.getJsonNumber(FhirPropertyNames.PROPERTY_AMOUNT).doubleValue();
        }

        /**
         * The relative base, or reference lens edge, for the prism.
         */
        public String base() {
            return getString(FhirPropertyNames.PROPERTY_BASE);
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

            public Builder amount(final Double amount) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT, amount);
                return this;
            }

            public Builder base(final String base) {
                b.add(FhirPropertyNames.PROPERTY_BASE, base);
                return this;
            }

            public VisionPrescriptionPrism build() {
                return new VisionPrescriptionPrism(b.build());
            }
        }
    }
}
