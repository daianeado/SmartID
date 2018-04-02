package com.smartID.service.impl;

import java.io.IOException;
import java.nio.file.FileSystems;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.nio.file.Path;

import com.smartID.domain.dto.QRCodeDTO;
import com.smartID.service.GenerateQRCodeService;

@Service
@EnableScheduling
public class GenerateQRCodeServiceImpl implements GenerateQRCodeService{

	@Override
	public void generateQRCodeImage(QRCodeDTO qrCodeProperties)
			throws WriterException, IOException {
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(qrCodeProperties.getText(), BarcodeFormat.QR_CODE, qrCodeProperties.getWidth(), qrCodeProperties.getHeight());

        Path path = FileSystems.getDefault().getPath(qrCodeProperties.getFilePath());
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	}

}
