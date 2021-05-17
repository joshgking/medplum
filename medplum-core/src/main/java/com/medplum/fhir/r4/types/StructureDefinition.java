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
 * A definition of a FHIR structure. This resource is used to describe
 * the underlying resources, data types defined in FHIR, and also for
 * describing extensions and constraints on resources and data types.
 */
public class StructureDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "StructureDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public StructureDefinition(final JsonObject data) {
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
     * An absolute URI that is used to identify this structure definition
     * when it is referenced in a specification, model, design or an
     * instance; also called its canonical identifier. This SHOULD be
     * globally unique and SHOULD be a literal address at which at which an
     * authoritative instance of this structure definition is (or will be)
     * published. This URL can be the target of a canonical reference. It
     * SHALL remain the same when the structure definition is stored on
     * different servers.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * A formal identifier that is used to identify this structure definition
     * when it is represented in other formats, or referenced in a
     * specification, model, design or an instance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier that is used to identify this version of the structure
     * definition when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the structure
     * definition author and is not expected to be globally unique. For
     * example, it might be a timestamp (e.g. yyyymmdd) if a managed version
     * is not available. There is also no expectation that versions can be
     * placed in a lexicographical sequence.
     */
    public String version() {
        return getString(FhirPropertyNames.PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the structure definition. This
     * name should be usable as an identifier for the module by machine
     * processing applications such as code generation.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * A short, descriptive, user-friendly title for the structure
     * definition.
     */
    public String title() {
        return getString(FhirPropertyNames.PROPERTY_TITLE);
    }

    /**
     * The status of this structure definition. Enables tracking the
     * life-cycle of the content.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this structure definition is authored
     * for testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_EXPERIMENTAL);
    }

    /**
     * The date  (and optionally time) when the structure definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the structure definition
     * changes.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the
     * structure definition.
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
     * A free text natural language description of the structure definition
     * from a consumer's perspective.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate structure definition instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, FhirPropertyNames.PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the structure definition is
     * intended to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this structure definition is needed and why it has
     * been designed as it has.
     */
    public String purpose() {
        return getString(FhirPropertyNames.PROPERTY_PURPOSE);
    }

    /**
     * A copyright statement relating to the structure definition and/or its
     * contents. Copyright statements are generally legal restrictions on the
     * use and publishing of the structure definition.
     */
    public String copyright() {
        return getString(FhirPropertyNames.PROPERTY_COPYRIGHT);
    }

    /**
     * A set of key words or terms from external terminologies that may be
     * used to assist with indexing and searching of templates nby describing
     * the use of this structure definition, or the content it describes.
     */
    public java.util.List<Coding> keyword() {
        return getList(Coding.class, FhirPropertyNames.PROPERTY_KEYWORD);
    }

    /**
     * The version of the FHIR specification on which this
     * StructureDefinition is based - this is the formal version of the
     * specification, without the revision number, e.g.
     * [publication].[major].[minor], which is 4.0.1. for this version.
     */
    public String fhirVersion() {
        return getString(FhirPropertyNames.PROPERTY_FHIR_VERSION);
    }

    /**
     * An external specification that the content is mapped to.
     */
    public java.util.List<StructureDefinitionMapping> mapping() {
        return getList(StructureDefinitionMapping.class, FhirPropertyNames.PROPERTY_MAPPING);
    }

    /**
     * Defines the kind of structure that this definition is describing.
     */
    public String kind() {
        return getString(FhirPropertyNames.PROPERTY_KIND);
    }

    /**
     * Whether structure this definition describes is abstract or not  - that
     * is, whether the structure is not intended to be instantiated. For
     * Resources and Data types, abstract types will never be exchanged
     * between systems.
     */
    public Boolean abstractValue() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ABSTRACT);
    }

    /**
     * Identifies the types of resource or data type elements to which the
     * extension can be applied.
     */
    public java.util.List<StructureDefinitionContext> context() {
        return getList(StructureDefinitionContext.class, FhirPropertyNames.PROPERTY_CONTEXT);
    }

    /**
     * A set of rules as FHIRPath Invariants about when the extension can be
     * used (e.g. co-occurrence variants for the extension). All the rules
     * must be true.
     */
    public java.util.List<String> contextInvariant() {
        return getList(String.class, FhirPropertyNames.PROPERTY_CONTEXT_INVARIANT);
    }

    /**
     * The type this structure describes. If the derivation kind is
     * 'specialization' then this is the master definition for a type, and
     * there is always one of these (a data type, an extension, a resource,
     * including abstract ones). Otherwise the structure definition is a
     * constraint on the stated type (and in this case, the type cannot be an
     * abstract type).  References are URLs that are relative to
     * http://hl7.org/fhir/StructureDefinition e.g. &quot;string&quot; is a reference
     * to http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are
     * only allowed in logical models.
     */
    public java.net.URI type() {
        return getUri(FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * An absolute URI that is the base structure from which this type is
     * derived, either by specialization or constraint.
     */
    public String baseDefinition() {
        return getString(FhirPropertyNames.PROPERTY_BASE_DEFINITION);
    }

    /**
     * How the type relates to the baseDefinition.
     */
    public String derivation() {
        return getString(FhirPropertyNames.PROPERTY_DERIVATION);
    }

    /**
     * A snapshot view is expressed in a standalone form that can be used and
     * interpreted without considering the base StructureDefinition.
     */
    public StructureDefinitionSnapshot snapshot() {
        return getObject(StructureDefinitionSnapshot.class, FhirPropertyNames.PROPERTY_SNAPSHOT);
    }

    /**
     * A differential view is expressed relative to the base
     * StructureDefinition - a statement of differences that it applies.
     */
    public StructureDefinitionDifferential differential() {
        return getObject(StructureDefinitionDifferential.class, FhirPropertyNames.PROPERTY_DIFFERENTIAL);
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

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(FhirPropertyNames.PROPERTY_EXPERIMENTAL, experimental);
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

        public Builder copyright(final String copyright) {
            b.add(FhirPropertyNames.PROPERTY_COPYRIGHT, copyright);
            return this;
        }

        public Builder keyword(final java.util.List<Coding> keyword) {
            b.add(FhirPropertyNames.PROPERTY_KEYWORD, FhirObject.toArray(keyword));
            return this;
        }

        public Builder fhirVersion(final String fhirVersion) {
            b.add(FhirPropertyNames.PROPERTY_FHIR_VERSION, fhirVersion);
            return this;
        }

        public Builder mapping(final java.util.List<StructureDefinitionMapping> mapping) {
            b.add(FhirPropertyNames.PROPERTY_MAPPING, FhirObject.toArray(mapping));
            return this;
        }

        public Builder kind(final String kind) {
            b.add(FhirPropertyNames.PROPERTY_KIND, kind);
            return this;
        }

        public Builder abstractValue(final Boolean abstractValue) {
            b.add(FhirPropertyNames.PROPERTY_ABSTRACT, abstractValue);
            return this;
        }

        public Builder context(final java.util.List<StructureDefinitionContext> context) {
            b.add(FhirPropertyNames.PROPERTY_CONTEXT, FhirObject.toArray(context));
            return this;
        }

        public Builder contextInvariant(final java.util.List<String> contextInvariant) {
            b.add(FhirPropertyNames.PROPERTY_CONTEXT_INVARIANT, FhirObject.toStringArray(contextInvariant));
            return this;
        }

        public Builder type(final java.net.URI type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type.toString());
            return this;
        }

        public Builder baseDefinition(final String baseDefinition) {
            b.add(FhirPropertyNames.PROPERTY_BASE_DEFINITION, baseDefinition);
            return this;
        }

        public Builder derivation(final String derivation) {
            b.add(FhirPropertyNames.PROPERTY_DERIVATION, derivation);
            return this;
        }

        public Builder snapshot(final StructureDefinitionSnapshot snapshot) {
            b.add(FhirPropertyNames.PROPERTY_SNAPSHOT, snapshot);
            return this;
        }

        public Builder differential(final StructureDefinitionDifferential differential) {
            b.add(FhirPropertyNames.PROPERTY_DIFFERENTIAL, differential);
            return this;
        }

        public StructureDefinition build() {
            return new StructureDefinition(b.build());
        }
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe
     * the underlying resources, data types defined in FHIR, and also for
     * describing extensions and constraints on resources and data types.
     */
    public static class StructureDefinitionContext extends FhirObject {
        public static final String RESOURCE_TYPE = "StructureDefinitionContext";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public StructureDefinitionContext(final JsonObject data) {
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
         * Defines how to interpret the expression that defines what the context
         * of the extension is.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * An expression that defines where an extension can be used in
         * resources.
         */
        public String expression() {
            return getString(FhirPropertyNames.PROPERTY_EXPRESSION);
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

            public Builder expression(final String expression) {
                b.add(FhirPropertyNames.PROPERTY_EXPRESSION, expression);
                return this;
            }

            public StructureDefinitionContext build() {
                return new StructureDefinitionContext(b.build());
            }
        }
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe
     * the underlying resources, data types defined in FHIR, and also for
     * describing extensions and constraints on resources and data types.
     */
    public static class StructureDefinitionDifferential extends FhirObject {
        public static final String RESOURCE_TYPE = "StructureDefinitionDifferential";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public StructureDefinitionDifferential(final JsonObject data) {
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
         * Captures constraints on each element within the resource.
         */
        public java.util.List<ElementDefinition> element() {
            return getList(ElementDefinition.class, FhirPropertyNames.PROPERTY_ELEMENT);
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

            public Builder element(final java.util.List<ElementDefinition> element) {
                b.add(FhirPropertyNames.PROPERTY_ELEMENT, FhirObject.toArray(element));
                return this;
            }

            public StructureDefinitionDifferential build() {
                return new StructureDefinitionDifferential(b.build());
            }
        }
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe
     * the underlying resources, data types defined in FHIR, and also for
     * describing extensions and constraints on resources and data types.
     */
    public static class StructureDefinitionMapping extends FhirObject {
        public static final String RESOURCE_TYPE = "StructureDefinitionMapping";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public StructureDefinitionMapping(final JsonObject data) {
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
         * An Internal id that is used to identify this mapping set when specific
         * mappings are made.
         */
        public String identity() {
            return getString(FhirPropertyNames.PROPERTY_IDENTITY);
        }

        /**
         * An absolute URI that identifies the specification that this mapping is
         * expressed to.
         */
        public java.net.URI uri() {
            return getUri(FhirPropertyNames.PROPERTY_URI);
        }

        /**
         * A name for the specification that is being mapped to.
         */
        public String name() {
            return getString(FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * Comments about this mapping, including version notes, issues, scope
         * limitations, and other important notes for usage.
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

            public Builder identity(final String identity) {
                b.add(FhirPropertyNames.PROPERTY_IDENTITY, identity);
                return this;
            }

            public Builder uri(final java.net.URI uri) {
                b.add(FhirPropertyNames.PROPERTY_URI, uri.toString());
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

            public StructureDefinitionMapping build() {
                return new StructureDefinitionMapping(b.build());
            }
        }
    }

    /**
     * A definition of a FHIR structure. This resource is used to describe
     * the underlying resources, data types defined in FHIR, and also for
     * describing extensions and constraints on resources and data types.
     */
    public static class StructureDefinitionSnapshot extends FhirObject {
        public static final String RESOURCE_TYPE = "StructureDefinitionSnapshot";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public StructureDefinitionSnapshot(final JsonObject data) {
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
         * Captures constraints on each element within the resource.
         */
        public java.util.List<ElementDefinition> element() {
            return getList(ElementDefinition.class, FhirPropertyNames.PROPERTY_ELEMENT);
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

            public Builder element(final java.util.List<ElementDefinition> element) {
                b.add(FhirPropertyNames.PROPERTY_ELEMENT, FhirObject.toArray(element));
                return this;
            }

            public StructureDefinitionSnapshot build() {
                return new StructureDefinitionSnapshot(b.build());
            }
        }
    }
}
