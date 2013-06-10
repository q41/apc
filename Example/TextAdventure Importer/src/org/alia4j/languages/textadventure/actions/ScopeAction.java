package org.alia4j.languages.textadventure.actions;

import java.util.List;

import org.alia4j.fial.System;
import org.alia4j.languages.textadventure.importer.SharedValue;
import org.alia4j.liam.Attachment;

public class ScopeAction {

	public static void enableScope(Object boundScopeValue, SharedValue sharedValue, List<Attachment> attachments) {
		sharedValue.value = boundScopeValue;
		for (Attachment attachment : attachments) {
			System.deploy(attachment);
		}
	}

	public static void disableScope(List<Attachment> attachments) {
		for (Attachment attachment : attachments) {
			System.undeploy(attachment);
		}
	}
	
}
