/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.orm.config.model.impl;

import com.speedment.orm.config.model.*;
import com.speedment.orm.config.model.parameters.ColumnCompressionType;
import com.speedment.orm.config.model.parameters.FieldStorageType;
import java.util.Optional;

/**
 *
 * @author pemi
 */
public class ColumnImpl extends AbstractOrdinalConfigEntity<Column, Table, ConfigEntity<?, Column, ?>> implements Column {

    private String alias;
    private FieldStorageType fieldStorageType;
    private ColumnCompressionType columnCompressionType;
    private Class<?> mapping;

    @Override
    protected void setDefaults() {
        setOrdinalPosition(ORDINAL_UNSET);
        setFieldStorageType(FieldStorageType.defaultFor(this));
        setColumnCompressionType(ColumnCompressionType.defaultFor(this));
        setMapping(String.class);
    }

    @Override
    public Optional<String> getAlias() {
        return Optional.ofNullable(alias);
    }

    @Override
    public Column setAlias(CharSequence alias) {
        return run(() -> this.alias = makeNullSafeString(alias));
    }

    @Override
    public FieldStorageType getFieldStorageType() {
        return fieldStorageType;
    }

    @Override
    public Column setFieldStorageType(FieldStorageType fieldStorageType) {
        return run(() -> this.fieldStorageType = fieldStorageType);
    }

    @Override
    public ColumnCompressionType getColumnCompressionType() {
        return columnCompressionType;
    }

    @Override
    public Column setColumnCompressionType(ColumnCompressionType columnCompressionType) {
        return run(() -> this.columnCompressionType = columnCompressionType);
    }

    @Override
    public Class<?> getMapping() {
        return mapping;
    }

    @Override
    public Column setMapping(Class<?> mappedClass) {
        return run(() -> this.mapping = mappedClass);
    }

}
