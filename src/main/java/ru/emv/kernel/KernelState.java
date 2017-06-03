package ru.emv.kernel;

/**
 * Created by fruit on 03.06.2017.
 */
public enum KernelState {
    IDLE,
    PDOL_DATA,
    GPO,
    EMV_READ_READER,
    GET_DATA,
    EMV_FIRST_WRITE_FLAG,
    MS_READ_RECORD,
    MAGSTRIPE_FIRST_WRITE_FLAG
}
