package eu.eurekabpo.eclipse.webtools.primefaces.taglibprocessing.attributevalues;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jst.jsf.context.resolver.structureddocument.IDOMContextResolver;
import org.eclipse.jst.jsf.context.resolver.structureddocument.IStructuredDocumentContextResolverFactory;
import org.eclipse.jst.jsf.metadataprocessors.features.PossibleValue;
import org.eclipse.jst.jsf.taglibprocessing.attributevalues.StringType;

public class TemplateType extends StringType {

	@Override
	public boolean isValidValue(String value) {
		return true;
	}

	@Override
	public List<PossibleValue> getPossibleValues() {
		List<PossibleValue> possibleValues = super.getPossibleValues();
		String currentValue = getCurrentAttrValue();
		return possibleValues.stream()
			.peek(val -> val.setValue(currentValue + val.getValue()))
			.collect(Collectors.toList());
	}
	
	private String getCurrentAttrValue() {
		if (getStructuredDocumentContext() != null){
			IDOMContextResolver resolver = IStructuredDocumentContextResolverFactory.INSTANCE.getDOMContextResolver(getStructuredDocumentContext());
			if (resolver != null){
				return resolver.getNode().getNodeValue();
			}
		}
		return ""; //$NON-NLS-1$

	}
}
