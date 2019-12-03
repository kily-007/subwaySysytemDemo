package edu.whut.gxzx.bean;

/**
 * @className Demodulator
 * @Description 仪表实体类
 * @Author admin
 * @Date 2019/12/3 14:53
 **/
public class Demodulator {
    //仪表
    int demodulatorID;//仪表编号
    String demodulatorPos;//仪表位置
    int channelNum;//通道数
    String sampleFreq;//采集频率，单位HZ
    String onlineTime;//上线时间
    String status;//仪表状态：是否启动

    public int getDemodulatorID() {
        return demodulatorID;
    }

    public void setDemodulatorID(int demodulatorID) {
        this.demodulatorID = demodulatorID;
    }

    public String getDemodulatorPos() {
        return demodulatorPos;
    }

    public void setDemodulatorPos(String demodulatorPos) {
        this.demodulatorPos = demodulatorPos;
    }

    public int getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(int channelNum) {
        this.channelNum = channelNum;
    }

    public String getSampleFreq() {
        return sampleFreq;
    }

    public void setSampleFreq(String sampleFreq) {
        this.sampleFreq = sampleFreq;
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
