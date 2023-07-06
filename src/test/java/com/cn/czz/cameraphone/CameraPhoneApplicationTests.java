package com.cn.czz.cameraphone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CameraPhoneApplicationTests {

    @Test
    void contextLoads() {
        if (vrtCrdstatus.equals("B") && crdstatus.equals("A")) {
            if (recomStuckBeside.isEmpty()) {
                // Activate physical card
                netTools4Esb.execute(ctx, "creditCardAct/creditCardAct");
            } else if (recomStuckBeside.equals("0")) {
                // Activate virtual card online
                ctx.setParam("TRAN CODE", TRAN_CODE);
                netTools4Esb.execute(ctx, "creditCardAct/virtualCardActivatedOnline");
                logger.info("-虚拟卡线上激活交易返回状态-" + ctx.getParam("STATUS") + ");");
            }
        } else if ((vrtCrdstatus.equals("A") && crdstatus.equals("A")) ||
                (vrtCrdstatus.equals("A") && crdstatus.isEmpty())) {
            // Activate virtual card online
            ctx.setParam("TRAN CODE", TRAN_CODE);
            netTools4Esb.execute(ctx, "creditCardAct/virtualCardActivatedOnline");
        } else if (vrtCrdstatus.equals("B") && crdstatus.isEmpty()) {
            // Activate physical card
            netTools4Esb.execute(ctx, "creditCardAct/creditCardAct");
        } else if (vrtCrdstatus.isEmpty() && crdstatus.isEmpty()) {
            // Do nothing
        } else if (vrtCrdstatus.isEmpty() && crdstatus.equals("A")) {
            // Activate physical card
            netTools4Esb.execute(ctx, "creditCardAct/creditCardAct");
        }

    }



}
