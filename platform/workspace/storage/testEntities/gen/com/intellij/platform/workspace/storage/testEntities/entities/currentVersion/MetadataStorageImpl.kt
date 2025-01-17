package com.intellij.platform.workspace.storage.testEntities.entities.currentVersion

import com.intellij.platform.workspace.storage.impl.ConnectionId
import com.intellij.platform.workspace.storage.metadata.impl.MetadataStorageBase
import com.intellij.platform.workspace.storage.metadata.model.EntityMetadata
import com.intellij.platform.workspace.storage.metadata.model.ExtendableClassMetadata
import com.intellij.platform.workspace.storage.metadata.model.FinalClassMetadata
import com.intellij.platform.workspace.storage.metadata.model.OwnPropertyMetadata
import com.intellij.platform.workspace.storage.metadata.model.StorageTypeMetadata
import com.intellij.platform.workspace.storage.metadata.model.ValueTypeMetadata

object MetadataStorageImpl: MetadataStorageBase() {
    init {

        val primitiveTypeStringNotNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = false, type = "String")
        val primitiveTypeListNotNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = false, type = "List")
        val primitiveTypeIntNotNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = false, type = "Int")
        val primitiveTypeSetNotNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = false, type = "Set")
        val primitiveTypeBooleanNotNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = false, type = "Boolean")
        val primitiveTypeIntNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = true, type = "Int")
        val primitiveTypeMapNotNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = false, type = "Map")
        val primitiveTypeStringNullable = ValueTypeMetadata.SimpleType.PrimitiveType(isNullable = true, type = "String")

        var typeMetadata: StorageTypeMetadata

        typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropEntityId", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "presentableName", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "texts", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.SymbolicEntityId"))

        addMetadata(typeMetadata)

        typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropsOrderEntityId", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "presentableName", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "names", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.SymbolicEntityId"))

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.AnotherOneToManyRefEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.AnotherOneToManyRefEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "parentEntity", valueType = ValueTypeMetadata.EntityReference(connectionType = ConnectionId.ConnectionType.ONE_TO_ONE, entityFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToManyRefEntity", isChild = false, isNullable = false), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "version", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someData", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToManyRefDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeSetNotNullable)), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false)), supertypes = listOf())), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.AnotherOneToOneRefEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.AnotherOneToOneRefEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someString", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "boolean", valueType = primitiveTypeBooleanNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "parentEntity", valueType = ValueTypeMetadata.EntityReference(connectionType = ConnectionId.ConnectionType.ONE_TO_MANY, entityFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToOneRefEntity", isChild = false, isNullable = false), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity",
"com.intellij.platform.workspace.storage.WorkspaceEntityWithSymbolicId"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = true, isKey = false, isOpen = false, name = "symbolicId", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropEntityId", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "presentableName", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "texts", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.SymbolicEntityId"))), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropsOrderEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropsOrderEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity",
"com.intellij.platform.workspace.storage.WorkspaceEntityWithSymbolicId"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = true, isKey = false, isOpen = false, name = "computableInt", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someKey", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = true, isKey = false, isOpen = false, name = "symbolicId", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedComputablePropsOrderEntityId", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "presentableName", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "names", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.SymbolicEntityId"))), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "names", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = true, isKey = false, isOpen = false, name = "computableString", valueType = primitiveTypeStringNotNullable, withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedEnumNameEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedEnumNameEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someEnum", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.EnumClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedEnumNameEnum", properties = listOf(), supertypes = listOf("kotlin.Enum",
"kotlin.Comparable",
"java.io.Serializable"), values = listOf("FIRST",
"SECOND",
"NOT_THIRD"))), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedPropsOrderEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedPropsOrderEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "version", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "string", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "data", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedPropsOrderDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf())), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeIntNotNullable), primitive = primitiveTypeSetNotNullable)), primitive = primitiveTypeListNotNullable), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedValueTypeEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ChangedValueTypeEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "type", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someKey", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ComputablePropEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.ComputablePropEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeIntNullable), primitive = primitiveTypeListNotNullable),
primitiveTypeStringNotNullable), primitive = primitiveTypeMapNotNullable)), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "computableText", valueType = primitiveTypeStringNotNullable, withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.DefaultPropEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.DefaultPropEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someString", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someList", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeIntNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "constInt", valueType = primitiveTypeIntNotNullable, withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.EnumPropsEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.EnumPropsEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someEnum", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.EnumClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.EnumPropsEnum", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false)), supertypes = listOf("kotlin.Enum",
"kotlin.Comparable",
"java.io.Serializable"), values = listOf("FIRST",
"SECOND",
"THIRD"))), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.KeyPropEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.KeyPropEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someInt", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "url", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.url.VirtualFileUrl")), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.NotNullToNullEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.NotNullToNullEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "nullInt", valueType = primitiveTypeIntNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "notNullString", valueType = primitiveTypeStringNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "notNullList", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeIntNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.NullToNotNullEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.NullToNotNullEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "nullString", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "notNullBoolean", valueType = primitiveTypeBooleanNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "notNullInt", valueType = primitiveTypeIntNotNullable, withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToManyRefEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToManyRefEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someData", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToManyRefDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeSetNotNullable)), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false)), supertypes = listOf())), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "anotherEntity", valueType = ValueTypeMetadata.EntityReference(connectionType = ConnectionId.ConnectionType.ONE_TO_ONE, entityFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.AnotherOneToManyRefEntity", isChild = true, isNullable = true), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToOneRefEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.OneToOneRefEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "version", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "anotherEntity", valueType = ValueTypeMetadata.EntityReference(connectionType = ConnectionId.ConnectionType.ONE_TO_MANY, entityFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.AnotherOneToOneRefEntity", isChild = true, isNullable = false), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someData", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = ExtendableClassMetadata.AbstractClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsSealedClass", subclasses = listOf(FinalClassMetadata.ObjectMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsSealedClass\$SecondSimpleObjectsSealedClassObject", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "listSize", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "id", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "data", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsSealedClass")),
FinalClassMetadata.ObjectMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsSealedClass\$FirstSimpleObjectsSealedClassObject", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "id", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "data", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleObjectsSealedClass"))), supertypes = listOf())), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimplePropsEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimplePropsEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeIntNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "set", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable)), primitive = primitiveTypeSetNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "map", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeSetNotNullable),
ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable)), primitive = primitiveTypeMapNotNullable), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "bool", valueType = primitiveTypeBooleanNotNullable, withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClassEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClassEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someData", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = ExtendableClassMetadata.AbstractClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClass", subclasses = listOf(FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClass\$SecondKeyPropDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "type", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "value", valueType = primitiveTypeIntNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeStringNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClass")),
FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClass\$FirstKeyPropDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "type", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "text", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SimpleSealedClass"))), supertypes = listOf())), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetEnumEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetEnumEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someEnum", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.EnumClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetEnumEnum", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "type", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("kotlin.Enum",
"kotlin.Comparable",
"java.io.Serializable"), values = listOf("FIRST",
"SECOND",
"THIRD",
"FOURTH",
"FIFTH"))), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)

        typeMetadata = EntityMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClassEntity", entityDataFqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClassEntityData", supertypes = listOf("com.intellij.platform.workspace.storage.WorkspaceEntity"), properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "entitySource", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = FinalClassMetadata.KnownClass(fqName = "com.intellij.platform.workspace.storage.EntitySource")), withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "someData", valueType = ValueTypeMetadata.SimpleType.CustomType(isNullable = false, typeMetadata = ExtendableClassMetadata.AbstractClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass", subclasses = listOf(FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass\$FirstSubsetSealedClassDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "name", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "string", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass")),
FinalClassMetadata.ClassMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass\$SecondSubsetSealedClassDataClass", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "name", valueType = primitiveTypeStringNotNullable, withDefault = false),
OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "list", valueType = ValueTypeMetadata.ParameterizedType(generics = listOf(primitiveTypeIntNotNullable), primitive = primitiveTypeListNotNullable), withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass")),
FinalClassMetadata.ObjectMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass\$FirstSubsetSealedClassObject", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "name", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass")),
FinalClassMetadata.ObjectMetadata(fqName = "com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass\$SecondSubsetSealedClassObject", properties = listOf(OwnPropertyMetadata(isComputable = false, isKey = false, isOpen = false, name = "name", valueType = primitiveTypeStringNotNullable, withDefault = false)), supertypes = listOf("com.intellij.platform.workspace.storage.testEntities.entities.currentVersion.SubsetSealedClass"))), supertypes = listOf())), withDefault = false)), extProperties = listOf(), isAbstract = false)

        addMetadata(typeMetadata)
    }
}
