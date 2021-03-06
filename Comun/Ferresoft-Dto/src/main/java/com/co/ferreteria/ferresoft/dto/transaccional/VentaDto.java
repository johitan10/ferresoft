package com.co.ferreteria.ferresoft.dto.transaccional;

import com.co.ferreteria.ferresoft.dto.maestro.ClienteDto;
import com.co.ferreteria.ferresoft.dto.maestro.TipoPagoDto;
import com.co.ferreteria.ferresoft.dto.maestro.TipoVentaDto;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Dto para la calse venta.
 *
 * @author johan
 */
public class VentaDto implements Serializable {

    private Long id;

    private Integer numeroFactura;

    private Integer numeroRemision;

    private Boolean aplicaIva;

    private List<DetalleVentaDto> detalleVenta;

    private Double subTotal;

    private Double total;

    private Double totalIva;

    private ClienteDto clienteDto;

    private TipoVentaDto tipoVentaDto;

    private TipoPagoDto tipoPagoDto;

    private Date fechaFactura;

    private Date fechaVencimiento;

    private Double totalImporte;

    private Date fechaInicio;
    
    private Date fechaFin;

    private Date fechaInicioVencimiento;
    
    private Date fechaFinVencimiento;
    
    public VentaDto() {
    }

    public VentaDto(final Long id, final String tipoVenta, final Long tipoVentaId, final Integer numeroFactura, 
            final Integer numeroRemision, final String tipoPag, 
            final Date fechaFactura, final Date fechaVencimiento, 
            final Double totalIva, final Double total) {
        this.id = id;
        TipoVentaDto tipoVen = new TipoVentaDto();
        tipoVen.setDescripcion(tipoVenta);
        tipoVen.setId(tipoVentaId);
        this.tipoVentaDto = tipoVen;
        this.numeroFactura = numeroFactura;
        this.numeroRemision = numeroRemision;        
        TipoPagoDto tipoPago = new TipoPagoDto();
        tipoPago.setDescripcion(tipoPag);
        this.tipoPagoDto = tipoPago;
        this.fechaFactura = fechaFactura;
        this.fechaVencimiento = fechaVencimiento;
        this.totalIva = totalIva;
        this.total = total;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Integer getNumeroRemision() {
        return numeroRemision;
    }

    public void setNumeroRemision(Integer numeroRemision) {
        this.numeroRemision = numeroRemision;
    }

    public Boolean getAplicaIva() {
        return aplicaIva;
    }

    public void setAplicaIva(Boolean aplicaIva) {
        this.aplicaIva = aplicaIva;
    }

    public List<DetalleVentaDto> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVentaDto> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteDto getClienteDto() {
        return clienteDto;
    }

    public void setClienteDto(ClienteDto clienteDto) {
        this.clienteDto = clienteDto;
    }

    public TipoVentaDto getTipoVentaDto() {
        return tipoVentaDto;
    }

    public void setTipoVentaDto(TipoVentaDto tipoVentaDto) {
        this.tipoVentaDto = tipoVentaDto;
    }

    public TipoPagoDto getTipoPagoDto() {
        return tipoPagoDto;
    }

    public void setTipoPagoDto(TipoPagoDto tipoPagoDto) {
        this.tipoPagoDto = tipoPagoDto;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(Double totalImporte) {
        this.totalImporte = totalImporte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
        if (this.fechaFin == null) {
            this.setFechaFin(new Date());
            System.err.println(this.fechaFin);
        }
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicioVencimiento() {
        return fechaInicioVencimiento;
    }

    public void setFechaInicioVencimiento(Date fechaInicioVencimiento) {
        this.fechaInicioVencimiento = fechaInicioVencimiento;
        if (this.fechaFinVencimiento == null) {
            this.setFechaFinVencimiento(new Date());
            System.err.println(this.fechaFinVencimiento);
        }
    }

    public Date getFechaFinVencimiento() {
        return fechaFinVencimiento;
    }

    public void setFechaFinVencimiento(Date fechaFinVencimiento) {
        this.fechaFinVencimiento = fechaFinVencimiento;
    }
    
    
}
