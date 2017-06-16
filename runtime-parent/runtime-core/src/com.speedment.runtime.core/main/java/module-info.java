module com.speedment.runtime.core {
    exports com.speedment.runtime.core.internal.component.sql;
    exports com.speedment.runtime.core.component.resultset;
    exports com.speedment.runtime.core.component.sql;
    exports com.speedment.runtime.core.component;
    exports com.speedment.runtime.core.db;
    exports com.speedment.runtime.core.exception;
    exports com.speedment.runtime.core.internal.util.sql;
    exports com.speedment.runtime.core.internal.util;
    exports com.speedment.runtime.core.internal;
    exports com.speedment.runtime.core.manager;
    exports com.speedment.runtime.core.util;
    exports com.speedment.runtime.core;
    requires com.speedment.common.function;
    requires com.speedment.common.injector;
    requires com.speedment.common.invariant;
    requires com.speedment.common.json;
    requires com.speedment.common.lazy;
    requires com.speedment.common.logger;
    requires com.speedment.common.mapstream;
    requires com.speedment.common.tuple;
    requires com.speedment.runtime.config;
    requires com.speedment.runtime.field;
    requires com.speedment.runtime.typemapper;
    requires java.prefs;
    requires java.sql;
}
