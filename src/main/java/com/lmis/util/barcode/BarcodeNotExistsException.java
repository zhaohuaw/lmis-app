package com.lmis.util.barcode;

/**
 * Created by chengdh on 14-7-30.
 */
public class BarcodeNotExistsException extends Exception {
    public BarcodeNotExistsException(String detailMessage) {
        super(detailMessage);
    }
}
