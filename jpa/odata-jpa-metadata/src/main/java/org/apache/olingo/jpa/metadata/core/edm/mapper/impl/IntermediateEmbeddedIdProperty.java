package org.apache.olingo.jpa.metadata.core.edm.mapper.impl;

import javax.persistence.metamodel.Attribute;

import org.apache.olingo.jpa.metadata.core.edm.mapper.exception.ODataJPAModelException;

public class IntermediateEmbeddedIdProperty extends IntermediateProperty {
  private final Attribute<?, ?> embeddable;

  IntermediateEmbeddedIdProperty(final JPAEdmNameBuilder nameBuilder, final Attribute<?, ?> jpaAttribute,
      final IntermediateSchema schema, final Attribute<?, ?> embeddable) throws ODataJPAModelException {
    super(nameBuilder, jpaAttribute, schema);
    this.embeddable = embeddable;
  }

  IntermediateEmbeddedIdProperty(final JPAEdmNameBuilder nameBuilder, final Attribute<?, ?> jpaAttribute,
      final IntermediateSchema schema) throws ODataJPAModelException {
    super(nameBuilder, jpaAttribute, schema);
    this.embeddable = null;
  }

  @Override
  public boolean isKey() {
    return true;
  }

  Attribute<?, ?> getEmbeddable() {
    return embeddable;
  }
}
