package org.drools.compiler.builder.impl;

import java.util.List;


import org.drools.compiler.assembler.KieAssemblerContext;
import org.drools.compiler.assembler.KieAssemblerFactory;
import org.drools.core.util.BaseFactoryRegistry;

public class KieAssemblerRegistry extends BaseFactoryRegistry<KieAssemblerFactory, KieAssemblerContext> {
    private static final KieAssemblerRegistry INSTANCE = new KieAssemblerRegistry();

    public static KieAssemblerRegistry getInstance() {
        return INSTANCE;
    }

    private KieAssemblerRegistry() {
        super( "kassembly.properties", "Kie Assembler");
    }

    @Override
    public KieAssemblerContext newKieFactoryInitContext(List<KieAssemblerFactory> list) {
        return null;
    }


}
