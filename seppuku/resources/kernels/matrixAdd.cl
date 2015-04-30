__kernel void matrixAdd(__global $MATRIXTYPE$ *a,
					    __global $MATRIXTYPE$ *b,
					    __global $MATRIXTYPE$ *result
					    )
{
	int local_x = get_local_id(0);
	int global_x = get_global_id( 0);

	result[global_x] = a[global_x] + b[global_x];
}