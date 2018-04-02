package com.smartID.service;

import java.io.IOException;

import com.google.zxing.WriterException;
import com.smartID.domain.dto.QRCodeDTO;

public interface GenerateQRCodeService {
	
	void generateQRCodeImage(QRCodeDTO qrCodeProperties) throws WriterException, IOException;

}
