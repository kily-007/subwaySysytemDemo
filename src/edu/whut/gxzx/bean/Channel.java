package edu.whut.gxzx.bean;

/**
 * @className Channel
 * @Description 通道实体类
 * @Author admin
 * @Date 2019/12/3 14:54
 **/
public class Channel {

    //通道
    int demodulatorID;//所属仪表
    int channelNo;//通道编号
    String channelPos;//通道位置
    int sensorNum;//该通道测区个数（每隔5米一个振动传感器采集点，定义每5米为一个测区）
    int frameSize;//数据帧大小
    int packetSize;//数据包大小
    double dataFlow;//数据流量


    public int getDemodulatorID() {
        return demodulatorID;
    }

    public void setDemodulatorID(int demodulatorID) {
        this.demodulatorID = demodulatorID;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    public String getChannelPos() {
        return channelPos;
    }

    public void setChannelPos(String channelPos) {
        this.channelPos = channelPos;
    }

    public int getSensorNum() {
        return sensorNum;
    }

    public void setSensorNum(int sensorNum) {
        this.sensorNum = sensorNum;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(int packetSize) {
        this.packetSize = packetSize;
    }

    public double getDataFlow() {
        return dataFlow;
    }

    public void setDataFlow(double dataFlow) {
        this.dataFlow = dataFlow;
    }

}
