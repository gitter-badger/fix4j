/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 fix4j.org (tools4j.org)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.fix4j.sketch;

import java.util.Objects;

public enum Fix42MessageType implements MessageType {
    Heartbeat("0"),
    TestRequest("1"),
    ResendRequest("2"),
    Reject("3"),
    SequenceReset("4"),
    Logout("5"),
    IOI("6"),
    Advertisement("7"),
    ExecutionReport("8"),
    OrderCancelReject("9"),
    Logon("A"),
    DerivativeSecurityList("AA"),
    NewOrderMultileg("AB"),
    MultilegOrderCancelReplace("AC"),
    TradeCaptureReportRequest("AD"),
    TradeCaptureReport("AE"),
    OrderMassStatusRequest("AF"),
    QuoteRequestReject("AG"),
    RFQRequest("AH"),
    QuoteStatusReport("AI"),
    QuoteResponse("AJ"),
    Confirmation("AK"),
    PositionMaintenanceRequest("AL"),
    PositionMaintenanceReport("AM"),
    RequestForPositions("AN"),
    RequestForPositionsAck("AO"),
    PositionReport("AP"),
    TradeCaptureReportRequestAck("AQ"),
    TradeCaptureReportAck("AR"),
    AllocationReport("AS"),
    AllocationReportAck("AT"),
    Confirmation_Ack("AU"),
    SettlementInstructionRequest("AV"),
    AssignmentReport("AW"),
    CollateralRequest("AX"),
    CollateralAssignment("AY"),
    CollateralResponse("AZ"),
    News("B"),
    CollateralReport("BA"),
    CollateralInquiry("BB"),
    NetworkCounterpartySystemStatusRequest("BC"),
    NetworkCounterpartySystemStatusResponse("BD"),
    UserRequest("BE"),
    UserResponse("BF"),
    CollateralInquiryAck("BG"),
    ConfirmationRequest("BH"),
    TradingSessionListRequest("BI"),
    TradingSessionList("BJ"),
    SecurityListUpdateReport("BK"),
    AdjustedPositionReport("BL"),
    AllocationInstructionAlert("BM"),
    ExecutionAcknowledgement("BN"),
    ContraryIntentionReport("BO"),
    SecurityDefinitionUpdateReport("BP"),
    SettlementObligationReport("BQ"),
    DerivativeSecurityListUpdateReport("BR"),
    TradingSessionListUpdateReport("BS"),
    MarketDefinitionRequest("BT"),
    MarketDefinition("BU"),
    MarketDefinitionUpdateReport("BV"),
    ApplicationMessageRequest("BW"),
    ApplicationMessageRequestAck("BX"),
    ApplicationMessageReport("BY"),
    OrderMassActionReport("BZ"),
    Email("C"),
    OrderMassActionRequest("CA"),
    UserNotification("CB"),
    StreamAssignmentRequest("CC"),
    StreamAssignmentReport("CD"),
    StreamAssignmentReportACK("CE"),
    PartyDetailsListRequest("CF"),
    PartyDetailsListReport("CG"),
    NewOrderSingle("D"),
    NewOrderList("E"),
    OrderCancelRequest("F"),
    OrderCancelReplaceRequest("G"),
    OrderStatusRequest("H"),
    AllocationInstruction("J"),
    ListCancelRequest("K"),
    ListExecute("L"),
    ListStatusRequest("M"),
    ListStatus("N"),
    AllocationInstructionAck("P"),
    DontKnowTradeDK("Q"),
    QuoteRequest("R"),
    Quote("S"),
    SettlementInstructions("T"),
    MarketDataRequest("V"),
    MarketDataSnapshotFullRefresh("W"),
    MarketDataIncrementalRefresh("X"),
    MarketDataRequestReject("Y"),
    QuoteCancel("Z"),
    QuoteStatusRequest("a"),
    MassQuoteAcknowledgement("b"),
    SecurityDefinitionRequest("c"),
    SecurityDefinition("d"),
    SecurityStatusRequest("e"),
    SecurityStatus("f"),
    TradingSessionStatusRequest("g"),
    TradingSessionStatus("h"),
    MassQuote("i"),
    BusinessMessageReject("j"),
    BidRequest("k"),
    BidResponse("l"),
    ListStrikePrice("m"),
    XML_non_FIX("n"),
    RegistrationInstructions("o"),
    RegistrationInstructionsResponse("p"),
    OrderMassCancelRequest("q"),
    OrderMassCancelReport("r"),
    NewOrderCross("s"),
    CrossOrderCancelReplaceRequest("t"),
    CrossOrderCancelRequest("u"),
    SecurityTypeRequest("v"),
    SecurityTypes("w"),
    SecurityListRequest("x"),
    SecurityList("y"),
    DerivativeSecurityListRequest("z");

    private final String tagValue;

    Fix42MessageType(final String tagValue) {
        this.tagValue = Objects.requireNonNull(tagValue);
    }

    @Override
    public String fieldValue() {
        return tagValue;
    }
}
