package rwcsim.utils.logging;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Calendar;

        import java.util.Calendar;
        import org.apache.log4j.PatternLayout;
        import org.apache.log4j.helpers.PatternConverter;
        import org.apache.log4j.helpers.PatternParser;
        import org.apache.log4j.spi.LoggingEvent;

public class RCPatternLayout extends PatternLayout {
    public RCPatternLayout() {
    }

    protected RCPatternLayout.WPatternParser createPatternParser(String pattern) {
        return new RCPatternLayout.WPatternParser(pattern);
    }

    public static class WalleyeDatePatternConverter extends PatternConverter {
        public static final String WALLEYE_FORMAT = "MMM dd HH:mm:ss.SSS";
        private final char[] m_buffer = "MMM dd HH:mm:ss.SSS".toCharArray();
        private final Calendar m_calendar = Calendar.getInstance();
        private long m_nLastTimestamp = -1L;
        private long m_nLastTimestampNoMillis = -1L;
        int lastHour = -1;

        public WalleyeDatePatternConverter() {
        }

        public void format(StringBuffer stringBuffer, LoggingEvent loggingEvent) {
            if (loggingEvent.timeStamp != this.m_nLastTimestamp) {
                this.m_nLastTimestamp = loggingEvent.timeStamp;
                int nMilli = (int)(loggingEvent.timeStamp % 1000L);
                if (loggingEvent.timeStamp - (long)nMilli != this.m_nLastTimestampNoMillis) {
                    this.m_nLastTimestampNoMillis = loggingEvent.timeStamp - (long)nMilli;
                    this.m_calendar.setTimeInMillis(loggingEvent.timeStamp);
                    switch(this.m_calendar.get(2)) {
                        case 0:
                            this.m_buffer[0] = 'J';
                            this.m_buffer[1] = 'a';
                            this.m_buffer[2] = 'n';
                            break;
                        case 1:
                            this.m_buffer[0] = 'F';
                            this.m_buffer[1] = 'e';
                            this.m_buffer[2] = 'b';
                            break;
                        case 2:
                            this.m_buffer[0] = 'M';
                            this.m_buffer[1] = 'a';
                            this.m_buffer[2] = 'r';
                            break;
                        case 3:
                            this.m_buffer[0] = 'A';
                            this.m_buffer[1] = 'p';
                            this.m_buffer[2] = 'r';
                            break;
                        case 4:
                            this.m_buffer[0] = 'M';
                            this.m_buffer[1] = 'a';
                            this.m_buffer[2] = 'y';
                            break;
                        case 5:
                            this.m_buffer[0] = 'J';
                            this.m_buffer[1] = 'u';
                            this.m_buffer[2] = 'n';
                            break;
                        case 6:
                            this.m_buffer[0] = 'J';
                            this.m_buffer[1] = 'u';
                            this.m_buffer[2] = 'l';
                            break;
                        case 7:
                            this.m_buffer[0] = 'A';
                            this.m_buffer[1] = 'u';
                            this.m_buffer[2] = 'g';
                            break;
                        case 8:
                            this.m_buffer[0] = 'S';
                            this.m_buffer[1] = 'e';
                            this.m_buffer[2] = 'p';
                            break;
                        case 9:
                            this.m_buffer[0] = 'O';
                            this.m_buffer[1] = 'c';
                            this.m_buffer[2] = 't';
                            break;
                        case 10:
                            this.m_buffer[0] = 'N';
                            this.m_buffer[1] = 'o';
                            this.m_buffer[2] = 'v';
                            break;
                        case 11:
                            this.m_buffer[0] = 'D';
                            this.m_buffer[1] = 'e';
                            this.m_buffer[2] = 'c';
                            break;
                        default:
//                            Assert.statementNeverExecuted();
                    }

                    int nDay = this.m_calendar.get(5);
                    this.m_buffer[4] = (char)(48 + nDay / 10);
                    this.m_buffer[5] = (char)(48 + nDay % 10);
                    int nHour = this.m_calendar.get(11);
                    this.m_buffer[7] = (char)(48 + nHour / 10);
                    this.m_buffer[8] = (char)(48 + nHour % 10);
                    int nMinute = this.m_calendar.get(12);
                    this.m_buffer[10] = (char)(48 + nMinute / 10);
                    this.m_buffer[11] = (char)(48 + nMinute % 10);
                    int nSecond = this.m_calendar.get(13);
                    this.m_buffer[13] = (char)(48 + nSecond / 10);
                    this.m_buffer[14] = (char)(48 + nSecond % 10);
                }

                this.m_buffer[16] = (char)(48 + nMilli / 100);
                this.m_buffer[17] = (char)(48 + nMilli / 10 % 10);
                this.m_buffer[18] = (char)(48 + nMilli % 10);
            }

            stringBuffer.append(this.m_buffer);
        }

        public void format(byte[] bytes, long timestamp) {
            if (timestamp != this.m_nLastTimestamp) {
                int nMilli = (int)(timestamp % 1000L);
                long noMillis = timestamp % 1000L;
                if (noMillis != this.m_nLastTimestampNoMillis) {
                    this.m_calendar.setTimeInMillis(timestamp);
                    int nHour = this.m_calendar.get(11);
                    int nDay;
                    if (this.lastHour != nHour) {
                        switch(this.m_calendar.get(2)) {
                            case 0:
                                bytes[0] = 74;
                                bytes[1] = 97;
                                bytes[2] = 110;
                                break;
                            case 1:
                                bytes[0] = 70;
                                bytes[1] = 101;
                                bytes[2] = 98;
                                break;
                            case 2:
                                bytes[0] = 77;
                                bytes[1] = 97;
                                bytes[2] = 114;
                                break;
                            case 3:
                                bytes[0] = 65;
                                bytes[1] = 112;
                                bytes[2] = 114;
                                break;
                            case 4:
                                bytes[0] = 77;
                                bytes[1] = 97;
                                bytes[2] = 121;
                                break;
                            case 5:
                                bytes[0] = 74;
                                bytes[1] = 117;
                                bytes[2] = 110;
                                break;
                            case 6:
                                bytes[0] = 74;
                                bytes[1] = 117;
                                bytes[2] = 108;
                                break;
                            case 7:
                                bytes[0] = 65;
                                bytes[1] = 117;
                                bytes[2] = 103;
                                break;
                            case 8:
                                bytes[0] = 83;
                                bytes[1] = 101;
                                bytes[2] = 112;
                                break;
                            case 9:
                                bytes[0] = 79;
                                bytes[1] = 99;
                                bytes[2] = 116;
                                break;
                            case 10:
                                bytes[0] = 78;
                                bytes[1] = 111;
                                bytes[2] = 118;
                                break;
                            case 11:
                                bytes[0] = 68;
                                bytes[1] = 101;
                                bytes[2] = 99;
                                break;
                            default:
//                                Assert.statementNeverExecuted();
                        }

                        bytes[3] = 32;
                        nDay = this.m_calendar.get(5);
                        bytes[4] = (byte)(48 + nDay / 10);
                        bytes[5] = (byte)(48 + nDay % 10);
                        bytes[6] = 32;
                        bytes[7] = (byte)(48 + nHour / 10);
                        bytes[8] = (byte)(48 + nHour % 10);
                        bytes[9] = 58;
                        bytes[12] = 58;
                        bytes[15] = 46;
                        this.lastHour = nHour;
                    }

                    nDay = this.m_calendar.get(12);
                    bytes[10] = (byte)(48 + nDay / 10);
                    bytes[11] = (byte)(48 + nDay % 10);
                    int nSecond = this.m_calendar.get(13);
                    bytes[13] = (byte)(48 + nSecond / 10);
                    bytes[14] = (byte)(48 + nSecond % 10);
                }

                bytes[16] = (byte)(48 + nMilli / 100);
                bytes[17] = (byte)(48 + nMilli / 10 % 10);
                bytes[18] = (byte)(48 + nMilli % 10);
                bytes[19] = 0;
            }

        }

        protected String convert(LoggingEvent event) {
//            Assert.statementNeverExecuted();
            return null;
        }
    }

    public static class WalleyeMessagePatternConverter extends PatternConverter {
        public WalleyeMessagePatternConverter() {
        }

        public void format(StringBuffer stringBuffer, LoggingEvent loggingEvent) {
            Object message = loggingEvent.getMessage();
            if (null != message) {
                if (message instanceof CharSequence) {
                    stringBuffer.append((CharSequence)message);
                } else {
                    stringBuffer.append(loggingEvent.getRenderedMessage());
                }
            }

        }

        protected String convert(LoggingEvent event) {
//            Assert.statementNeverExecuted();
            return null;
        }
    }

    private static class WPatternParser extends PatternParser {
        public WPatternParser(String pattern) {
            super(pattern);
        }

        protected void finalizeConverter(char c) {
            if ('m' == c) {
                this.currentLiteral.setLength(0);
                this.addConverter(new RCPatternLayout.WalleyeMessagePatternConverter());
            } else {
                if ('d' == c) {
                    int saveI = this.i;
                    String sOption = this.extractOption();
                    if (null != sOption && "MMM dd HH:mm:ss.SSS".equals(sOption)) {
                        this.currentLiteral.setLength(0);
                        this.addConverter(new RCPatternLayout.WalleyeDatePatternConverter());
                        return;
                    }

                    this.i = saveI;
                }

                super.finalizeConverter(c);
            }
        }
    }
}
