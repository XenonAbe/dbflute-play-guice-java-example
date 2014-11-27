-- #VendorCheckDecimalSum#

select sum(vendor.TYPE_OF_NUMERIC_DECIMAL) as DECIMAL_DIGIT_SUM
  from VENDOR_CHECK vendor
