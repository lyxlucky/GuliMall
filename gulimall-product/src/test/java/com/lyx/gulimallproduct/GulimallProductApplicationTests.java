package com.lyx.gulimallproduct;

import com.lyx.gulimallproduct.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {



//        B2StorageClient client = B2StorageClientFactory
//                .createDefaultFactory()
//                .create("", "", USER_AGENT);
//
//        final B2ListFileVersionsRequest request = B2ListFileVersionsRequest
//                .builder("24e9647723cb568c8b930415")
//                .build();
//        for (B2FileVersion version : client.fileVersions(request)) {
//            System.out.println("fileVersion: " + version);
//        }
//        String extension = file.getName().split(".")[1];
//
//        B2FileContentSource build = B2FileContentSource.build(file);
//        B2UploadFileRequest.Builder builder = B2UploadFileRequest.builder("24e9647723cb568c8b930415", "b2Oss", "txt", build);
//        client.uploadSmallFile(builder.build());


//        String downloadByIdUrl = client.getDownloadByIdUrl("4_z24e9647723cb568c8b930415_f116a36b6e24c8157_d20230715_m061434_c004_v0402015_t0003_u01689401674294");
//        System.out.println("downloadByIdUrl = " + downloadByIdUrl);

    }

}
