import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { ArticleListConfig, TagsService, UserService } from '../core';

@Component({
  selector: 'app-home-page',
  templateUrl: './generate-qrcode.component.html',
  styleUrls: ['./generate-qrcode.component.css']
})
export class GenerateQrCodeComponent implements OnInit {

  selectedValues: any;
  
  constructor(
    private router: Router,
    private tagsService: TagsService,
    private userService: UserService

  ) {}


  ngOnInit() {

  }

  gerarQRCode() {
    this.router.navigateByUrl('/login');
  }
}
