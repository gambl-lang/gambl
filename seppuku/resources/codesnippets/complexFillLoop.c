for(int i_§ID§_§NUM§ = 0; i_§ID§_§NUM§ < §ID§.rows ; i_§ID§_§NUM§++) {
    for(int j_§ID§_§NUM§ = 0; j_§ID§_§NUM§ < §ID§.cols ; j_§ID§_§NUM§++) {
        ((§SIMPLETYPE§ *) §ID§.dataStart)[i_§ID§_§NUM§ * §ID§.cols + j_§ID§_§NUM§] = §ID§_fillArray[i_§ID§_§NUM§ * §ID§.cols + j_§ID§_§NUM§];
    }
}