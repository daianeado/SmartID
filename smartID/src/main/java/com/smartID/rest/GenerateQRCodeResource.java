package com.smartID.rest;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.WriterException;
import com.smartID.domain.dto.QRCodeDTO;
import com.smartID.service.GenerateQRCodeService;

@RestController
@RequestMapping("/api")
public class GenerateQRCodeResource {

	private final GenerateQRCodeService generateQRCodeService;
	
	public GenerateQRCodeResource(GenerateQRCodeService generateQRCodeService) {
		this.generateQRCodeService = generateQRCodeService;
	}

	 @PostMapping("/gerar-qr-code")
	 public void gerarQRCode(@RequestBody QRCodeDTO qrCodeProperties) throws WriterException, IOException {
		 generateQRCodeService.generateQRCodeImage(qrCodeProperties);
	 }
	 
}
