package com.doge.types;

import com.doge.AST.Variable;

/**
 * Created by michno on 20/3/15.
 */
public class TypeParser {

    public static String cTypeFromValueType(ValueType datatype) {
        switch (datatype) {
            case VOID:
                return "void";
            case INT:
            case MATRIX_INT:
            case VECTOR_INT:
                return "int32_t";
            case INT16:
            case MATRIX_INT16:
            case VECTOR_INT16:
                return "int16_t";
            case INT64:
            case MATRIX_INT64:
            case VECTOR_INT64:
                return "int64_t";
            case FLOAT:
            case MATRIX_FLOAT:
            case VECTOR_FLOAT:
                return "float";
            case FLOAT16:
            case MATRIX_FLOAT16:
            case VECTOR_FLOAT16:
                //There exists no such thing as 16-bit real numbers in C...
                return "float";
            case FLOAT64:
            case MATRIX_FLOAT64:
            case VECTOR_FLOAT64:
                return "double";
            case BOOLEAN:
            case MATRIX_BOOLEAN:
            case VECTOR_BOOLEAN:
                return "bool";
        }
        return null;
    }

    public static String OpenCL_TypeFromValueType(ValueType datatype) {
        switch (datatype) {
            case VOID:
                return "void";
            case INT:
            case MATRIX_INT:
            case VECTOR_INT:
                return "cl_int";
            case INT16:
            case MATRIX_INT16:
            case VECTOR_INT16:
                return "cl_short";
            case INT64:
            case MATRIX_INT64:
            case VECTOR_INT64:
                return "cl_long";
            case FLOAT:
            case MATRIX_FLOAT:
            case VECTOR_FLOAT:
                return "cl_float";
            case FLOAT16:
            case MATRIX_FLOAT16:
            case VECTOR_FLOAT16:
                return "cl_half";
            case FLOAT64:
            case MATRIX_FLOAT64:
            case VECTOR_FLOAT64:
                return "cl_double";
            case BOOLEAN:
            case MATRIX_BOOLEAN:
            case VECTOR_BOOLEAN:
                return "cl_char";
        }
        return null;
    }

    public static ValueType ConstantType(Object constant) {
        if (constant.getClass() == null || constant.getClass() == Variable.class) {
            return ValueType.INVALID;
        }

        if (constant.getClass() == Boolean.class) {
            return ValueType.BOOLEAN;
        }

        if (constant.getClass() == String.class && ((String) constant).contains(".")) {
            Double tmp = Double.parseDouble((String) constant);
            if (tmp != null)
                return ValueType.FLOAT;
        } else {
            Long tmp = Long.parseLong((String) constant);
            if (tmp != null)
                return ValueType.INT;
        }

        return ValueType.INVALID;
    }

    public static boolean isComplexValueType(ValueType type) {
        switch (type) {
            case MATRIX_INT16:
            case MATRIX_INT:
            case MATRIX_INT64:
            case MATRIX_FLOAT16:
            case MATRIX_FLOAT:
            case MATRIX_FLOAT64:
            case MATRIX_BOOLEAN:
            case VECTOR_INT16:
            case VECTOR_INT:
            case VECTOR_INT64:
            case VECTOR_FLOAT16:
            case VECTOR_FLOAT:
            case VECTOR_FLOAT64:
            case VECTOR_BOOLEAN:
                return true;
            default:
                return false;
        }
    }
}
