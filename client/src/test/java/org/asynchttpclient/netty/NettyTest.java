package org.asynchttpclient.netty;

import io.netty.handler.codec.compression.Brotli;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class NettyTest {
    
    @Test
    public void brotliIsAvailableOnLinux() throws Throwable {
        Brotli.ensureAvailability();
        assertTrue(Brotli.isAvailable());
    }

}
