package org.folio.bulkops.domain.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.folio.bulkops.domain.dto.IdentifierType;

/**
 * Marker interface for entities for which bulk operations is applicable.
 */
public interface BulkOperationsEntity {
  String getIdentifier(IdentifierType identifierType);
  Integer _version();
  @JsonIgnore
  default BulkOperationsEntity getRecordBulkOperationEntity() {
    return null;
  }
}
