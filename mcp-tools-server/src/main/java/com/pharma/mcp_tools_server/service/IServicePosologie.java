package com.pharma.mcp_tools_server.service;
import java.util.List;
import java.util.Map;

public interface IServicePosologie {
    List<Map<String, Object>> calculer(String dci, int age, double poidsKg);
}