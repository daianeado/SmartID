import { NgModule } from '@angular/core';
import { GenerateQrCodeComponent } from './generate-qrcode.component';
import { GenerateQrCodeResolver } from './generate-qrcode-resolver.service';

import {CheckboxModule} from 'primeng/checkbox';

import { SharedModule } from '../shared';
import { GenerateQrCodeRoutingModule } from './generate-qrcode-routing.module';

@NgModule({
  imports: [
    SharedModule,
    GenerateQrCodeRoutingModule,
    CheckboxModule
  ],
  declarations: [
    GenerateQrCodeComponent
  ],
  providers: [
    GenerateQrCodeResolver
  ]
})
export class GenerateQrCodeModule {}
