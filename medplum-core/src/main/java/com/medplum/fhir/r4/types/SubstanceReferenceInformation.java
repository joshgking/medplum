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
 * Todo.
 */
public class SubstanceReferenceInformation extends FhirResource {
    public static final String RESOURCE_TYPE = "SubstanceReferenceInformation";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SubstanceReferenceInformation(final JsonObject data) {
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
     * Todo.
     */
    public String comment() {
        return getString(FhirPropertyNames.PROPERTY_COMMENT);
    }

    /**
     * Todo.
     */
    public java.util.List<SubstanceReferenceInformationGene> gene() {
        return getList(SubstanceReferenceInformationGene.class, FhirPropertyNames.PROPERTY_GENE);
    }

    /**
     * Todo.
     */
    public java.util.List<SubstanceReferenceInformationGeneElement> geneElement() {
        return getList(SubstanceReferenceInformationGeneElement.class, FhirPropertyNames.PROPERTY_GENE_ELEMENT);
    }

    /**
     * Todo.
     */
    public java.util.List<SubstanceReferenceInformationClassification> classification() {
        return getList(SubstanceReferenceInformationClassification.class, FhirPropertyNames.PROPERTY_CLASSIFICATION);
    }

    /**
     * Todo.
     */
    public java.util.List<SubstanceReferenceInformationTarget> target() {
        return getList(SubstanceReferenceInformationTarget.class, FhirPropertyNames.PROPERTY_TARGET);
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

        public Builder comment(final String comment) {
            b.add(FhirPropertyNames.PROPERTY_COMMENT, comment);
            return this;
        }

        public Builder gene(final java.util.List<SubstanceReferenceInformationGene> gene) {
            b.add(FhirPropertyNames.PROPERTY_GENE, FhirObject.toArray(gene));
            return this;
        }

        public Builder geneElement(final java.util.List<SubstanceReferenceInformationGeneElement> geneElement) {
            b.add(FhirPropertyNames.PROPERTY_GENE_ELEMENT, FhirObject.toArray(geneElement));
            return this;
        }

        public Builder classification(final java.util.List<SubstanceReferenceInformationClassification> classification) {
            b.add(FhirPropertyNames.PROPERTY_CLASSIFICATION, FhirObject.toArray(classification));
            return this;
        }

        public Builder target(final java.util.List<SubstanceReferenceInformationTarget> target) {
            b.add(FhirPropertyNames.PROPERTY_TARGET, FhirObject.toArray(target));
            return this;
        }

        public SubstanceReferenceInformation build() {
            return new SubstanceReferenceInformation(b.build());
        }
    }

    /**
     * Todo.
     */
    public static class SubstanceReferenceInformationClassification extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceReferenceInformationClassification";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceReferenceInformationClassification(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept domain() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_DOMAIN);
        }

        /**
         * Todo.
         */
        public CodeableConcept classification() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CLASSIFICATION);
        }

        /**
         * Todo.
         */
        public java.util.List<CodeableConcept> subtype() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_SUBTYPE);
        }

        /**
         * Todo.
         */
        public java.util.List<Reference> source() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SOURCE);
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

            public Builder domain(final CodeableConcept domain) {
                b.add(FhirPropertyNames.PROPERTY_DOMAIN, domain);
                return this;
            }

            public Builder classification(final CodeableConcept classification) {
                b.add(FhirPropertyNames.PROPERTY_CLASSIFICATION, classification);
                return this;
            }

            public Builder subtype(final java.util.List<CodeableConcept> subtype) {
                b.add(FhirPropertyNames.PROPERTY_SUBTYPE, FhirObject.toArray(subtype));
                return this;
            }

            public Builder source(final java.util.List<Reference> source) {
                b.add(FhirPropertyNames.PROPERTY_SOURCE, FhirObject.toArray(source));
                return this;
            }

            public SubstanceReferenceInformationClassification build() {
                return new SubstanceReferenceInformationClassification(b.build());
            }
        }
    }

    /**
     * Todo.
     */
    public static class SubstanceReferenceInformationGene extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceReferenceInformationGene";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceReferenceInformationGene(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept geneSequenceOrigin() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_GENE_SEQUENCE_ORIGIN);
        }

        /**
         * Todo.
         */
        public CodeableConcept gene() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_GENE);
        }

        /**
         * Todo.
         */
        public java.util.List<Reference> source() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SOURCE);
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

            public Builder geneSequenceOrigin(final CodeableConcept geneSequenceOrigin) {
                b.add(FhirPropertyNames.PROPERTY_GENE_SEQUENCE_ORIGIN, geneSequenceOrigin);
                return this;
            }

            public Builder gene(final CodeableConcept gene) {
                b.add(FhirPropertyNames.PROPERTY_GENE, gene);
                return this;
            }

            public Builder source(final java.util.List<Reference> source) {
                b.add(FhirPropertyNames.PROPERTY_SOURCE, FhirObject.toArray(source));
                return this;
            }

            public SubstanceReferenceInformationGene build() {
                return new SubstanceReferenceInformationGene(b.build());
            }
        }
    }

    /**
     * Todo.
     */
    public static class SubstanceReferenceInformationGeneElement extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceReferenceInformationGeneElement";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceReferenceInformationGeneElement(final JsonObject data) {
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
         * Todo.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Todo.
         */
        public Identifier element() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_ELEMENT);
        }

        /**
         * Todo.
         */
        public java.util.List<Reference> source() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SOURCE);
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

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder element(final Identifier element) {
                b.add(FhirPropertyNames.PROPERTY_ELEMENT, element);
                return this;
            }

            public Builder source(final java.util.List<Reference> source) {
                b.add(FhirPropertyNames.PROPERTY_SOURCE, FhirObject.toArray(source));
                return this;
            }

            public SubstanceReferenceInformationGeneElement build() {
                return new SubstanceReferenceInformationGeneElement(b.build());
            }
        }
    }

    /**
     * Todo.
     */
    public static class SubstanceReferenceInformationTarget extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceReferenceInformationTarget";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceReferenceInformationTarget(final JsonObject data) {
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
         * Todo.
         */
        public Identifier target() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_TARGET);
        }

        /**
         * Todo.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Todo.
         */
        public CodeableConcept interaction() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_INTERACTION);
        }

        /**
         * Todo.
         */
        public CodeableConcept organism() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ORGANISM);
        }

        /**
         * Todo.
         */
        public CodeableConcept organismType() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ORGANISM_TYPE);
        }

        /**
         * Todo.
         */
        public Quantity amountQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_AMOUNT_QUANTITY);
        }

        /**
         * Todo.
         */
        public Range amountRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_AMOUNT_RANGE);
        }

        /**
         * Todo.
         */
        public String amountString() {
            return getString(FhirPropertyNames.PROPERTY_AMOUNT_STRING);
        }

        /**
         * Todo.
         */
        public CodeableConcept amountType() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_AMOUNT_TYPE);
        }

        /**
         * Todo.
         */
        public java.util.List<Reference> source() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SOURCE);
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

            public Builder target(final Identifier target) {
                b.add(FhirPropertyNames.PROPERTY_TARGET, target);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder interaction(final CodeableConcept interaction) {
                b.add(FhirPropertyNames.PROPERTY_INTERACTION, interaction);
                return this;
            }

            public Builder organism(final CodeableConcept organism) {
                b.add(FhirPropertyNames.PROPERTY_ORGANISM, organism);
                return this;
            }

            public Builder organismType(final CodeableConcept organismType) {
                b.add(FhirPropertyNames.PROPERTY_ORGANISM_TYPE, organismType);
                return this;
            }

            public Builder amountQuantity(final Quantity amountQuantity) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT_QUANTITY, amountQuantity);
                return this;
            }

            public Builder amountRange(final Range amountRange) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT_RANGE, amountRange);
                return this;
            }

            public Builder amountString(final String amountString) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT_STRING, amountString);
                return this;
            }

            public Builder amountType(final CodeableConcept amountType) {
                b.add(FhirPropertyNames.PROPERTY_AMOUNT_TYPE, amountType);
                return this;
            }

            public Builder source(final java.util.List<Reference> source) {
                b.add(FhirPropertyNames.PROPERTY_SOURCE, FhirObject.toArray(source));
                return this;
            }

            public SubstanceReferenceInformationTarget build() {
                return new SubstanceReferenceInformationTarget(b.build());
            }
        }
    }
}
