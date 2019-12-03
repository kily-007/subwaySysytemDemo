package edu.whut.gxzx.InitModule;

import edu.whut.gxzx.bean.Channel;
import edu.whut.gxzx.bean.Demodulator;

/**
 * @className test1
 * @Description 仪表/通道参数传递类
 * @Author admin
 * @Date 2019/12/2 17:25
 * **/
public class MeterParameters {
    Demodulator demodulator;//仪表
    Channel channel1;//四通道
    Channel channel2;
    Channel channel3;
    Channel channel4;

    public MeterParameters(Demodulator demodulator) {
        this.demodulator = demodulator;
    }

    public MeterParameters(Demodulator demodulator, Channel channel1, Channel channel2, Channel channel3, Channel channel4) {
        this.demodulator = demodulator;
        this.channel1 = channel1;
        this.channel2 = channel2;
        this.channel3 = channel3;
        this.channel4 = channel4;
    }

    public Demodulator getDemodulator() {
        return demodulator;
    }

    public void setDemodulator(Demodulator demodulator) {
        this.demodulator = demodulator;
    }

    public Channel getChannel1() {
        return channel1;
    }

    public void setChannel1(Channel channel1) {
        this.channel1 = channel1;
    }

    public Channel getChannel2() {
        return channel2;
    }

    public void setChannel2(Channel channel2) {
        this.channel2 = channel2;
    }

    public Channel getChannel3() {
        return channel3;
    }

    public void setChannel3(Channel channel3) {
        this.channel3 = channel3;
    }

    public Channel getChannel4() {
        return channel4;
    }

    public void setChannel4(Channel channel4) {
        this.channel4 = channel4;
    }
}
