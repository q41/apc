package org.alia4j.languages.bp.importer;

import org.alia4j.hierarchy.TypeDescriptor;
import org.alia4j.hierarchy.TypeDescriptorConstants;

//all possible types an attribute can have
public enum AttributeType {
	DOUBLE,
	INT,
	BOOLEAN;

	//return the type descriptor conforming with this AttributeType
	public TypeDescriptor getTypeDescriptor() {
		TypeDescriptor type = null;
		switch(this) {
		case DOUBLE: type = TypeDescriptorConstants.DOUBLE_PRIMITIVE; break;
		case INT: type = TypeDescriptorConstants.INT_PRIMITIVE; break;
		case BOOLEAN: type = TypeDescriptorConstants.BOOLEAN_PRIMITIVE; break;
		}
		return type;
	}
}