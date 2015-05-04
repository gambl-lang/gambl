__kernel void matrixMul(const __global int *matrixA,
                        const __global int *matrixB,
                        __global int *matrixResult,
                        int rowsA,
                        int colsA,
                        int rowsB,
                        int colsB
                        )
{
    int currentX = get_global_id(0);
    int currentY = get_global_id(1);
    int index = currentX * colsA + currentY;
    for(int k = 0; k < rowsB; k++){
          matrixResult[index] += matrixA[currentX * colsA + k] * matrixB[k * colsB + currentY];
    }
}