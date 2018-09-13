/**
 * 
 */
package gov.gsa.fas.services.order.v1.wdc.mapping;

import gov.gsa.fas.order.v1.Order;
import gov.gsa.fas.services.order.v1.wdc.parsing.ParsedRecord;

/**
 * @author zabelc
 *
 */
public interface RecordMapper {

	/**
	 * Map the fields in the record into those in the order
	 * @param record
	 * @param order 
	 * 		Order object which has been initialized. Note that
	 * 		no child objects are guaranteed to have been initialized
	 */
	void mapParsedRecordToOrder(ParsedRecord record, Order order);

}
